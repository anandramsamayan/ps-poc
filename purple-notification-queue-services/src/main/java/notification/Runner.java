package notification;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;






@Component
public class Runner implements CommandLineRunner {

    private final RabbitTemplate rabbitTemplate;
    private final Receiver receiver;
    @Autowired
    private final NotificationsDAL notificationsDAL;
    private final NotificationsRepository notificationsRepository;

    public Runner(Receiver receiver, RabbitTemplate rabbitTemplate,
    		NotificationsDAL notificationsDAL,NotificationsRepository notificationsRepository) {
        this.receiver = receiver;
        this.rabbitTemplate = rabbitTemplate;
        this.notificationsDAL = notificationsDAL;
        this.notificationsRepository = notificationsRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Sending message...");
       List<NotificationVO> notificationVOList =   notificationsDAL.getAllSubmittedAsyncNotifications();
        User user = new User();
        int i=0;
       // while(true)
        {
        for(NotificationVO notificationVO:notificationVOList) 	
        {
        	ObjectMapper Obj = new ObjectMapper();
   	        	  
   	         // get Oraganisation object as a json string 
   	         String jsonStr = Obj.writeValueAsString(notificationVO); 

   	         // Displaying JSON String 
   	         System.out.println(jsonStr); 
   	    
        	
        	rabbitTemplate.convertAndSend(Application.topicExchangeName, "foo.bar.baz",jsonStr );
        	i++;
        }
        receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
        }
    }

}
