package com.purpleslate.notification.preference;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.purpleslate.notification.dal.NotificationVO;


public class ObjectBuilder {

	public static void main(String args[])
	{
		ObjectBuilder obBuilder = new ObjectBuilder();
		/*NotificationVO notificationVO = new NotificationVO();
		ObjectMapper Obj = new ObjectMapper();
	     try { 
	    	  
	         // get Oraganisation object as a json string 
	         String jsonStr = Obj.writeValueAsString(notificationVO); 

	         // Displaying JSON String 
	         System.out.println(jsonStr); 
	     }
	     catch(IOException ioex)
	     {
	    	 
	     }*/
		//String output = obBuilder.getJsonforMapper();
		
		//String json = obBuilder.getJsonForTemplate();
		/*
		 ObjectMapper mapper = new ObjectMapper();
		 CommTemplate[] commTemplates=null;
		try {
			commTemplates = mapper.readValue(json, CommTemplate[].class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<CommTemplate> list = new ArrayList<CommTemplate>(Arrays.asList(commTemplates));*/
		
		System.out.println("1:"+ obBuilder.getJson());
		System.out.println("2:"+ obBuilder.getJsonForTemplate());
		System.out.println("3:"+ obBuilder.getJsonforMapper());
	}
	public String getJsonforMapper()
	{
		String jsonStr=null;
		
		List<MsgTypeToTemplateMapper> msgTypeToTemplateMapperList = new ArrayList<MsgTypeToTemplateMapper>();
		
		MsgTypeToTemplateMapper msgTypeToTemplateMapper = new MsgTypeToTemplateMapper();
		msgTypeToTemplateMapper.setId("ABCHealthMsgMap001");
		msgTypeToTemplateMapper.setClientId("PSABCHLTHPRI20190106");
		msgTypeToTemplateMapper.setMsgId("msgtype001");
		List<String> templateids = new ArrayList<String>();
		templateids.add("tmpltemsgtype001");
		templateids.add("tmpltemsgtype002");
		msgTypeToTemplateMapper.setTemplateIds(templateids);
		msgTypeToTemplateMapperList.add(msgTypeToTemplateMapper);
		
		msgTypeToTemplateMapper = new MsgTypeToTemplateMapper();
		msgTypeToTemplateMapper.setId("ABCHealthMsgMap002");
		msgTypeToTemplateMapper.setClientId("PSABCHLTHPRI20190106");
		msgTypeToTemplateMapper.setMsgId("msgtype002");
		templateids = new ArrayList<String>();
		templateids.add("tmpltemsgtype003");
		templateids.add("tmpltemsgtype004");
		msgTypeToTemplateMapper.setTemplateIds(templateids);
		msgTypeToTemplateMapperList.add(msgTypeToTemplateMapper);
		
		msgTypeToTemplateMapper = new MsgTypeToTemplateMapper();
		msgTypeToTemplateMapper.setId("ABCHealthMsgMap003");
		msgTypeToTemplateMapper.setClientId("PSABCHLTHPRI20190106");
		msgTypeToTemplateMapper.setMsgId("msgtype003");
		templateids = new ArrayList<String>();
		templateids.add("tmpltemsgtype001");
		templateids.add("tmpltemsgtype002");
		msgTypeToTemplateMapper.setTemplateIds(templateids);
		msgTypeToTemplateMapperList.add(msgTypeToTemplateMapper);
		
		msgTypeToTemplateMapper = new MsgTypeToTemplateMapper();
		msgTypeToTemplateMapper.setId("ABCHealthMsgMap004");
		msgTypeToTemplateMapper.setClientId("PSABCHLTHPRI20190106");
		msgTypeToTemplateMapper.setMsgId("msgtype004");
		templateids = new ArrayList<String>();
		templateids.add("tmpltemsgtype003");
		templateids.add("tmpltemsgtype004");
		msgTypeToTemplateMapper.setTemplateIds(templateids);
		msgTypeToTemplateMapperList.add(msgTypeToTemplateMapper);
		
		
		
		ObjectMapper Obj = new ObjectMapper();
	     try { 
	    	  
	         // get Oraganisation object as a json string 
	          jsonStr = Obj.writeValueAsString(msgTypeToTemplateMapperList); 

	         // Displaying JSON String 
	         System.out.println(jsonStr); 
	      
	     } 

	     catch (IOException e) { 
	         e.printStackTrace(); 
	     } 
	     
	     return jsonStr;
	}
	public String getJsonForTemplate()
	{
		List<CommTemplate> commTemplates = new ArrayList<CommTemplate>();
		
		 CommTemplate commTemplate = new CommTemplate();		
		 commTemplate.setId("tmpltemsgtype001");
		 commTemplate.setClientId("PSABCHLTHPRI20190106");
		 commTemplate.setName("Welcome Mailer");
		 commTemplate.setContent("Hi {{user}},\\r\\nYou are receiving this mail as part of welcoming on board {{today}}.\\r\\n\\r\\n{{user}}, \\r\\n\\r\\n\\r\\nThanks,\\r\\nABC Health\",\r\n" + 
		 		"                     \"desc\":\"Welcome mail");
		 commTemplate.setDesc("Welcome Mailer");
		 commTemplate.setChannelId("1");
		 commTemplates.add(commTemplate);
		 
		 commTemplate = new CommTemplate();
		 commTemplate.setId("tmpltemsgtype002");
		 commTemplate.setClientId("PSABCHLTHPRI20190106");
		 commTemplate.setName("Welcome Mailer");
		 commTemplate.setContent("Hi {{user}},\\r\\nYou are receiving this mail as part of welcoming on board {{today}}.\\r\\n\\r\\n{{user}}, \\r\\n\\r\\n\\r\\nThanks,\\r\\nABC Health\",\r\n" + 
		 		"                     \"desc\":\"Welcome mail");
		 commTemplate.setDesc("Welcome Mailer");
		 commTemplate.setChannelId("2");
		 commTemplates.add(commTemplate);
		 
		 commTemplate = new CommTemplate();
		 commTemplate.setId("tmpltemsgtype003");
		 commTemplate.setClientId("PSABCHLTHPRI20190106");
		 commTemplate.setName("PinRest");
		 commTemplate.setContent("Hi {{user}},\\r\\nYou OTP for pin reset is {{OTP}} {{today}}.\\r\\n\\r\\n{{user}}, \\r\\n\\r\\n\\r\\nThanks,\\r\\nABC Health\",\r\n" + 
		 		"                     \"desc\":\"Welcome mail");
		 commTemplate.setDesc("Welcome Mailer");
		 commTemplate.setChannelId("1");
		 commTemplates.add(commTemplate);
		 
		 commTemplate = new CommTemplate();
		 commTemplate.setId("tmpltemsgtype004");
		 commTemplate.setClientId("PSABCHLTHPRI20190106");
		 commTemplate.setName("PinRest");
		 commTemplate.setContent("Hi {{user}},\\r\\nYou OTP for pin reset is {{OTP}} {{today}}.\\r\\n\\r\\n{{user}}, \\r\\n\\r\\n\\r\\nThanks,\\r\\nABC Health\",\r\n" + 
		 		"                     \"desc\":\"Welcome mail");
		 commTemplate.setDesc("Welcome Mailer");
		 commTemplate.setChannelId("2");
		 commTemplates.add(commTemplate);
		 String jsonStr =null;
		 
		 ObjectMapper Obj = new ObjectMapper();
	     try { 
	    	  
	         // get Oraganisation object as a json string 
	          jsonStr = Obj.writeValueAsString(commTemplates); 

	         // Displaying JSON String 
	         System.out.println(jsonStr); 
	      
	     } 

	     catch (IOException e) { 
	         e.printStackTrace(); 
	     } 
	     
	     return jsonStr;
		
	}
	public String getJson()
	{
		NotificationPreferences notificationPreferences = new NotificationPreferences();
		notificationPreferences.setClientname("ABC Health");
		notificationPreferences.setClientid("PSABCHLTHPRI20190106");
		
		
		notificationPreferences.setFromId("admin@abchealth.com");
		notificationPreferences.setPrefPartner("twilio");
		notificationPreferences.setCommMode("Online");
		notificationPreferences.setDeliveryReceiptRequired("Yes");
		notificationPreferences.setFailoverCallbackUrl("hhtps://abchealth/failure/report?");
		notificationPreferences.setWorkingHours("8AM-8PM/IST/MON-FRI");
		notificationPreferences.setIsDNDEnabledOffBusshrs("Yes");
		
		CommChannel commChannel1 = new CommChannel();
		commChannel1.setId("1");
		commChannel1.setName("Email");
		commChannel1.setPrefPartner("Twilio");
		commChannel1.setBillingInfoRequired("Yes");
		commChannel1.setApiKey("adssewewesdsasssssqeewrererewew12wqwq321qwqwq1dkkkkk");
		commChannel1.setCommEndPoint("https://sendgrid.mail.io/apikey?");
		commChannel1.setRetryAllowed("Yes");
		
		CommChannel commChannel2 = new CommChannel();
		commChannel2.setId("2");
		commChannel2.setName("SMS");
		commChannel2.setPrefPartner("Twilio");
		commChannel2.setBillingInfoRequired("Yes");
		commChannel2.setApiKey("nmnmntutdttytyrertrtrttrwtewewerwewewewewewewew:yhfftttttr");
		commChannel2.setCommEndPoint("https://api.textlocal.in/send/?");
		commChannel2.setRetryAllowed("Yes");
		
		CommCategory commCategory1 = new CommCategory();
		commCategory1.setId("1");
		commCategory1.setType("Promotional");
		commCategory1.setMode("Async");
		commCategory1.setIsfutureDateSupported("Yes");
		commCategory1.setDeliveryReceiptRequired("Yes");
		commCategory1.setFailoverCallbackUrl("https://abc.in/xyz/failurepostings.../");
		commCategory1.setRetryRequired("Yes");
		String[] blocklist = new String[]{"abc@abc.com","nndbc@gmail.com"};
		commCategory1.setBlocklist(blocklist);
		CommTemplate commTemplate = new CommTemplate();
		commTemplate.setId("wlcmMailerPROM20191");
		commTemplate.setName("WelcomeMailer");
		commTemplate.setDesc("Welcome mail");
		commTemplate.setContent("Hi {{user}},\r\n" + 
				"You are receiving this mail as part of welcoming on board {{today}}.\r\n" + 
				"\r\n" + 
				"{{user}}, \r\n" + 
				"\r\n" + 
				"\r\n" + 
				"Thanks,\r\n" + 
				notificationPreferences.getClientname());
		CommTemplate commTemplate1 = new CommTemplate();
		commTemplate1.setId("bDayMailerPROM20191");
		commTemplate1.setName("bDayMailer");
		commTemplate1.setDesc("BirthDay mail");
		commTemplate1.setContent("Hi {{user}},\r\n" + 
				"Wishing you a very happy birth day {{today}}.\r\n" + 
				"\r\n" + 
				"{{user}}, \r\n" + 
				"\r\n" + 
				"\r\n" + 
				"Thanks,\r\n" + 
				notificationPreferences.getClientname());
		
		List <CommTemplate> commTemplates = new ArrayList<CommTemplate>();
		commTemplates.add(commTemplate);
		commTemplates.add(commTemplate1);
		//commCategory1.setComTemplates(commTemplates	);
		List <CommCategory> commCategorys = new ArrayList<CommCategory>();
		
		commCategorys.add(commCategory1);
			
		CommCategory commCategory2 = new CommCategory();
		commCategory2.setId("2");
		commCategory2.setIsfutureDateSupported("No");
		commCategory2.setType("Transactional");
		commCategory2.setMode("Sync");
		commCategory2.setDeliveryReceiptRequired("Yes");
		commCategory2.setFailoverCallbackUrl("https://abc.in/xyz/failurepostings.../");
		commCategory2.setRetryRequired("Yes");
		String[] blocklist1 = new String[]{"abc@abc.com","nndbc@gmail.com"};
		commCategory2.setBlocklist(blocklist1);
		CommTemplate commTemplate2 = new CommTemplate();
		commTemplate2.setId("pinRSTMailerTRANS20191");
		commTemplate2.setName("Pin reset OTP");
		commTemplate2.setDesc("Pin reset OTP");
		commTemplate2.setContent("Hi {{user}},\r\n" + 
				"You are receiving this mail as part of welcoming on board {{today}}.\r\n" + 
				"\r\n" + 
				"{{user}}, \r\n" + 
				"\r\n" + 
				"\r\n" + 
				"Thanks,\r\n" + 
				notificationPreferences.getClientname());
		List <CommTemplate> commTemplates1 = new ArrayList<CommTemplate>();
		commTemplates1.add(commTemplate2);
		
		
		
		commCategorys.add(commCategory2);
		
		List <CommChannel> commChannels = new ArrayList<CommChannel>();
		/*commChannel1.setCommCategorys(commCategorys);
		commChannel2.setCommCategorys(commCategorys1);*/
		commChannels.add(commChannel1);
		commChannels.add(commChannel2);
		
		notificationPreferences.setChannelsOpted(commChannels);
		notificationPreferences.setCommCategorys(commCategorys);
		MsgType msgType1 = new MsgType();
		
		List<String> commChannelIds = new ArrayList<String>();
		commChannelIds.add("1");
		commChannelIds.add("2");
		
		msgType1.setId("msgtype001");
		msgType1.setCommChannelIds(commChannelIds);
		msgType1.setCommCategoryId("1");
		msgType1.setRetryRequired("Yes");
		List<String> templateIds = new ArrayList<String>();
		templateIds.add("tmpltemsgtype001");
		templateIds.add("tmpltemsgtype002");
		//msgType1.setCommTemplatIds(templateIds);
		msgType1.setDeliveryReceiptRequired("Yes");
		msgType1.setPriorityId("priority001");
		
MsgType msgType2 = new MsgType();
		
msgType2.setId("msgtype002");
msgType2.setCommChannelIds(commChannelIds);
msgType2.setCommCategoryId("2");
msgType2.setRetryRequired("Yes");
templateIds = new ArrayList<String>();
templateIds.add("tmpltemsgtype003");
templateIds.add("tmpltemsgtype004");
//msgType2.setCommTemplatIds(templateIds);
msgType2.setDeliveryReceiptRequired("Yes");
msgType2.setPriorityId("priority001");
		
MsgType msgType3 = new MsgType();
		
msgType3.setId("msgtype003");
msgType3.setCommChannelIds(commChannelIds);
msgType3.setCommCategoryId("1");
msgType3.setRetryRequired("Yes");
templateIds = new ArrayList<String>();
templateIds.add("tmpltemsgtype005");
templateIds.add("tmpltemsgtype006");
//msgType3.setCommTemplatIds(templateIds);
msgType3.setDeliveryReceiptRequired("Yes");
msgType3.setPriorityId("priority001");
		
MsgType msgType4 = new MsgType();
		
msgType4.setId("msgtype004");
msgType4.setCommChannelIds(commChannelIds);
msgType4.setCommCategoryId("2");
msgType4.setRetryRequired("Yes");
templateIds = new ArrayList<String>();
templateIds.add("tmpltemsgtype007");
templateIds.add("tmpltemsgtype008");
//msgType4.setCommTemplatIds(templateIds);
msgType4.setDeliveryReceiptRequired("Yes");
msgType4.setPriorityId("priority001");
		
		
List<MsgType>	msgTypeList = new ArrayList<MsgType>();
msgTypeList.add(msgType1);
msgTypeList.add(msgType2);
msgTypeList.add(msgType3);
msgTypeList.add(msgType4);
notificationPreferences.setMsgTypes(msgTypeList);

		ObjectMapper Obj = new ObjectMapper();
	     try { 
	    	  
	         // get Oraganisation object as a json string 
	         String jsonStr = Obj.writeValueAsString(notificationPreferences); 

	         // Displaying JSON String 
	         System.out.println(jsonStr); 
	         return jsonStr;
	     } 

	     catch (IOException e) { 
	         e.printStackTrace(); 
	     } 
		
		
		return null;
		
	}}
