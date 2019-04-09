package notification;

import java.util.concurrent.CountDownLatch;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Receiver {

	 RestTemplate restTemplate = new RestTemplate();
	
	
    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        restTemplate.postForEntity("http://localhost:8080//notification/sendNotificationFromQueue", message,String.class);
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}
