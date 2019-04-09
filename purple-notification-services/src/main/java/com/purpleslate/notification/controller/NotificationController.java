package com.purpleslate.notification.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.purpleslate.notification.dal.CommTemplateDAL;
import com.purpleslate.notification.dal.CommTemplateRepository;
import com.purpleslate.notification.dal.CommTemplateVO;
import com.purpleslate.notification.dal.MsgTypeToTemplateMapperDAL;
import com.purpleslate.notification.dal.MsgTypeToTemplateMapperVO;
import com.purpleslate.notification.dal.MsgTypeToTmplMapperRepository;
import com.purpleslate.notification.dal.NotificationPrefRepository;
import com.purpleslate.notification.dal.NotificationPreferences;
import com.purpleslate.notification.dal.NotificationPreferencesDAL;
import com.purpleslate.notification.dal.NotificationVO;
import com.purpleslate.notification.dal.NotificationsDAL;
import com.purpleslate.notification.dal.NotificationsRepository;
import com.purpleslate.notification.fo.Email;
import com.purpleslate.notification.fo.MessageFlow;
import com.purpleslate.notification.fo.Notification;
import com.purpleslate.notification.fo.NotificationMessWrapper;
import com.purpleslate.notification.fo.NotificationResponce;
import com.purpleslate.notification.preference.CommTemplate;
import com.purpleslate.notification.preference.MsgType;
import com.purpleslate.notification.service.AppMailSender;
import com.purpleslate.notification.service.AppSMSSender;
import com.purpleslate.notification.service.Sendgridmailer;
import com.purpleslate.notification.util.NotoficationFlowUtil;




@RestController
@RequestMapping("/notification")
public class NotificationController{
	
	 private AppMailSender appMailSender;
	 
	 private final NotificationPrefRepository notificationPrefRepository;
	 
	 private final NotificationsRepository notificationsRepository;
	 
	 private final MsgTypeToTmplMapperRepository msgTypeToTmplMapperRepository;
	 
	 private final CommTemplateRepository commTemplateRepository;

	 private final NotificationPreferencesDAL notificationPreferencesDAL;
	 	 
	 private final NotificationsDAL notificationsDAL;
	 
	 private final CommTemplateDAL commTemplateDAL;
	 
	 private final MsgTypeToTemplateMapperDAL msgTypeToTemplateMapperDAL;
	
	 private AppSMSSender appSMSSender;

	 private com.purpleslate.notification.preference.NotificationPreferences clientPreference  =null;
	 
	 
	 public NotificationController(AppMailSender appMailSender,
			 NotificationPrefRepository notificationPrefRepository,NotificationsRepository notificationsRepository,
			 NotificationPreferencesDAL notificationPreferencesDAL,AppSMSSender appSMSSender,NotificationsDAL notificationsDAL,
			 MsgTypeToTmplMapperRepository msgTypeToTmplMapperRepository,CommTemplateRepository commTemplateRepository,
			 CommTemplateDAL commTemplateDAL,MsgTypeToTemplateMapperDAL msgTypeToTemplateMapperDAL) {
	       
	    	this.appMailSender = appMailSender;	       
	        this.appSMSSender = appSMSSender;
	        this.notificationsDAL = notificationsDAL;
	        this.notificationPreferencesDAL = notificationPreferencesDAL;
	        this.notificationPrefRepository = notificationPrefRepository;
	        this.notificationsRepository = notificationsRepository;
	        this.msgTypeToTmplMapperRepository = msgTypeToTmplMapperRepository;
	        this.commTemplateRepository = commTemplateRepository;
	        this.msgTypeToTemplateMapperDAL = msgTypeToTemplateMapperDAL;
	        this.commTemplateDAL = commTemplateDAL; 
	        
	        
	    }

	 public com.purpleslate.notification.preference.NotificationPreferences constructNotificationPreference(String ClientId) throws JsonParseException, JsonMappingException, IOException

	 {
		 NotificationPreferences notificationPreferences = notificationPreferencesDAL.getNotificationPreferencesById("PSABCHLTHPRI20190106");
			ObjectMapper Obj = new ObjectMapper();
		 com.purpleslate.notification.preference.NotificationPreferences clientPreference = Obj.readValue(notificationPreferences.getClientPrefJSON(), com.purpleslate.notification.preference.NotificationPreferences.class);
	    
		List<MsgType> msgTypes =  clientPreference.getMsgTypes();
		 
		 List<MsgTypeToTemplateMapperVO> msgTypeToTemplateMapperVOList =  msgTypeToTemplateMapperDAL.getMsgTemplateMappersByClientId("PSABCHLTHPRI20190106");
		 List<CommTemplateVO> comTemplateVOList = commTemplateDAL.getMsgTemplateMappersByClientId("PSABCHLTHPRI20190106");
		 for(MsgType msgType:msgTypes)
		 {
			for(MsgTypeToTemplateMapperVO msgTypeToTemplateMapperVO:msgTypeToTemplateMapperVOList)
		 
		 { if(msgType.getId().equals(msgTypeToTemplateMapperVO.getMsgId()))
			 {
			 String templIds = msgTypeToTemplateMapperVO.getTemplateIds();
			 ArrayList<String> templateList = Obj.readValue(templIds, ArrayList.class);
			for(String tempid:templateList)
			{
				for(CommTemplateVO commTemplateVO:comTemplateVOList)
				{
					if(commTemplateVO.getId().equals(tempid))
					{
						CommTemplate complate = new CommTemplate();
						complate.setId(commTemplateVO.getId());
						complate.setClientId(commTemplateVO.getClientId());
						complate.setName(commTemplateVO.getName());
						complate.setContent(commTemplateVO.getContent());
						complate.setDesc(commTemplateVO.getDesc());
						complate.setChannelId(commTemplateVO.getChannelId());
						
					msgType.getCommTemplates().add(complate);
						}
					}
			}
			 }
		 }
		 }
		 
		 clientPreference.getMsgTypes();
		 return clientPreference;
	 }
	
	 @RequestMapping(value = "/createPreference", method = RequestMethod.POST)
	 public String addNewNotificationPreference(@RequestBody NotificationPreferences notificationPreferences) {
		 try {
			constructNotificationPreference("PSABCHLTHPRI20190106");
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 
		 /*ObjectBuilder objectBuilder = new ObjectBuilder();
			notificationPreferences.setClientPrefJSON(objectBuilder.getJson());
			 notificationPrefRepository.save(notificationPreferences);
			
			 //===================================================================
			 objectBuilder = new ObjectBuilder();
			 ObjectMapper mapper = new ObjectMapper();
			
			 CommTemplate[] commTemplates=null;
			try {
				commTemplates = mapper.readValue(objectBuilder.getJsonForTemplate(), CommTemplate[].class);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ArrayList<CommTemplate> list = new ArrayList<CommTemplate>(Arrays.asList(commTemplates));
			for(CommTemplate commTemplate:list )
			{	
				CommTemplateVO commTemplateVO = new CommTemplateVO();
				commTemplateVO.setId(commTemplate.getId());
				commTemplateVO.setClientId(commTemplate.getClientId());
				commTemplateVO.setName(commTemplate.getName());
				commTemplateVO.setContent(commTemplate.getContent());
				commTemplateVO.setDesc(commTemplate.getDesc());
				commTemplateVO.setChannelId(commTemplate.getChannelId());
				
				commTemplateRepository.save(commTemplateVO);
			}
				 
				 //==================================================================================
				 objectBuilder = new ObjectBuilder();
				 mapper = new ObjectMapper();
				 try {
					 MsgTypeToTemplateMapper[] msgTypemappers =	mapper.readValue(objectBuilder.getJsonforMapper(), MsgTypeToTemplateMapper[].class);
				
				 ArrayList<MsgTypeToTemplateMapper> mapperlist = new ArrayList<MsgTypeToTemplateMapper>(Arrays.asList(msgTypemappers));
				 for(MsgTypeToTemplateMapper msgTypeToTemplateMapper:mapperlist )
					{	
					 MsgTypeToTemplateMapperVO msgTypeToTemplateMapperVO = new MsgTypeToTemplateMapperVO();
					 msgTypeToTemplateMapperVO.setId(msgTypeToTemplateMapper.getId());
					 msgTypeToTemplateMapperVO.setClientId(msgTypeToTemplateMapper.getClientId());
					 msgTypeToTemplateMapperVO.setMsgId(msgTypeToTemplateMapper.getMsgId());
					 msgTypeToTemplateMapperVO.setTemplateIds(mapper.writeValueAsString(msgTypeToTemplateMapper.getTemplateIds()));
					
					 msgTypeToTmplMapperRepository.save(msgTypeToTemplateMapperVO);
					}	
				 
				 } catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 return "Success";*/
		
		 
	 return "Success";
	 }
	 
	 
	 @RequestMapping(value = "/sendNotificationFromQueue", method = RequestMethod.POST)
	    public String sendNotificationFromQueue(@RequestBody String notification,@RequestHeader HttpHeaders headers) throws Exception{
		System.out.println("notification="+notification);
		ObjectMapper mapper = new ObjectMapper();
		NotificationVO notificationVO = mapper.readValue(notification, NotificationVO.class);
		
		
			System.out.println("notificationEmail="+notificationVO.getEmailJson());
		if(notificationVO.getEmailJson()!=null)
			{mapper = new ObjectMapper();
			Email email = mapper.readValue(notificationVO.getEmailJson(), Email.class);
			Sendgridmailer.sendMailer(email,"Hi {{user}},\r\n" + 
					"You are receiving this mail as part of welcoming on board {{today}}.\r\n" + 
					"\r\n" + 
					"{{user}}, \r\n" + 
					"\r\n" + 
					"\r\n" + 
					"Thanks,\r\n" + 
					"ABC Health");
		
			notificationsDAL.updateSubmittedAsyncNotifications(notificationVO);}
			
			return "Success";
		 }
	    
	 @RequestMapping(value = "/sendNotification", method = RequestMethod.POST)
    public NotificationResponce sendNotification(@RequestBody Notification notification,@RequestHeader HttpHeaders headers) throws Exception{
		 NotificationResponce nresponse = new NotificationResponce();
		 if(clientPreference==null)
		 {
			 clientPreference = constructNotificationPreference("PSABCHLTHPRI20190106");
		 }
		 
    	NotificationVO notificationVO = null;
    	
    	
    	
      
    	NotificationMessWrapper notificationMessWrapper = NotoficationFlowUtil.constructNotificationMessWrapper(clientPreference);
    	Map<String, MessageFlow> messageMap = notificationMessWrapper.getMessgFlowMap();
    	if(notification.getEmail()!=null)
    	{
    		notificationVO = new  NotificationVO();
        	notificationVO.setMessageId("correlationId");
        	notificationVO.setClientId(notification.getClientId());
    		MessageFlow emailMessageFlow = messageMap.get(notification.getMsgType()+"-channel-"+notification.getEmail().getChannelName());
    	
        	notificationVO.setCategory(emailMessageFlow.getCommCategoryType());
            if(notification.getEmail().getFutureDate()!=null)
            {
            	notificationVO.setFutureDate(notification.getEmail().getFutureDate());
            	notificationVO.setIsFutureDated("Yes");
            }
            			 
        	notificationVO.setMode(emailMessageFlow.getMode());
    		notificationVO.setStatus(emailMessageFlow.getStatusToBeSet());			
    		
			 
			 ObjectMapper Obj = new ObjectMapper();
			    // get Oraganisation object as a json string 
			    String jsonStr = Obj.writeValueAsString(notification.getEmail()); 
		        // Displaying JSON String 
		        System.out.println(jsonStr); 
		    	notificationVO.setEmailJson(jsonStr);
		    	
		     Sendgridmailer.sendMailer(notification.getEmail(),emailMessageFlow.getCommTemplate().getContent());
		    			    	
            	
            		    	 
            		 }
            		 if(notification.getSms()!=null)
            		 {

            	    		notificationVO = new  NotificationVO();
            	        	notificationVO.setMessageId("correlationId");
            	        	notificationVO.setClientId(notification.getClientId());
            	    		MessageFlow smsMessageFlow = messageMap.get(notification.getMsgType()+"-channel-"+notification.getSms().getChannelName());
            	    	
            	        	notificationVO.setCategory(smsMessageFlow.getCommCategoryType());
            	           /* if(notification.getSms()!=null)
            	            {
            	            	notificationVO.setFutureDate(notification.getEmail().getFutureDate());
            	            	notificationVO.setIsFutureDated("Yes");
            	            }*/
            	            			 
            	        	notificationVO.setMode(smsMessageFlow.getMode());
            	    		notificationVO.setStatus(smsMessageFlow.getStatusToBeSet());			
            	    		
            				 
            				 ObjectMapper Obj = new ObjectMapper();
            				    // get Oraganisation object as a json string 
            				    String jsonStr = Obj.writeValueAsString(notification.getSms()); 
            			        // Displaying JSON String 
            			        System.out.println(jsonStr); 
            			    	notificationVO.setEmailJson(jsonStr);
            			    	
            			    	 appSMSSender.sendSms("apiKey", "message", "sender", "numbers",notification.getSms());
          		 }
            		
   	notificationsDAL.insertNotification(notificationVO);
   	nresponse.setNotificationStatus("Notification Sent");
        return nresponse;
    }
    
    @PostMapping("/sendNotificationWithTemplate")
    public NotificationResponce sendNotificationWithTemplate(@RequestBody Notification notification,@RequestHeader HttpHeaders headers) throws Exception{
    	
    	
       
        return new NotificationResponce();
    }
    
    @PostMapping("/createGroup")
    public NotificationResponce createNotificationGroup(@RequestBody Notification notification,@RequestHeader HttpHeaders headers) throws Exception{
    	
    	
       
        return new NotificationResponce();
    }

    @GetMapping("/getContacts/{group-id}")
    public NotificationResponce getContactsFromGroup(@RequestBody Notification notification,@RequestHeader HttpHeaders headers) throws Exception{
    	
    	
       
        return new NotificationResponce();
    }

    
    @GetMapping("/getInboxes")
    public NotificationResponce getInBoxes(Notification notification){
        return new NotificationResponce();
    }
    
    @GetMapping("/getNotificationTemplates")
    public NotificationResponce getNotificationTemplates(Notification notification){
        return new NotificationResponce();
    }
    
    @GetMapping("/getNotifications")
    public NotificationResponce getNotifications(Notification notification){
        return new NotificationResponce();
    }


}
