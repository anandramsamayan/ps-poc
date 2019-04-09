package com.purpleslate.notification;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.purpleslate.notification.fo.Email;
import com.purpleslate.notification.fo.Message;
import com.purpleslate.notification.fo.Notification;
import com.purpleslate.notification.fo.SMS;
import com.purpleslate.notification.fo.SMSContacts;
import com.purpleslate.notification.fo.SMSGroup;
import com.purpleslate.notification.fo.ScheduledMail;

public class ObjectBuilder {

	public static void main(String args[])
	{
	
	  Notification notification = new Notification();
	  Email email = new Email();
	  SMS sms = new SMS();
	
	  notification.setClientId("PSABCHLTHPRI20190106");
	  email.setFrom("admin@abchealth.com");
	  List tolist = new ArrayList<String>();
	  tolist.add("anandram.samayan@gmail.com");
	  email.setTo(tolist);
	  email.setCc(tolist);
	  email.setSubject("test broadcast");
	  email.setHtml(false);	 
	 
	  
	  email.setSend_at(System.currentTimeMillis()+"");	 
	  
	  Map<String, String> replacements = new HashMap<String, String>();
		replacements.put("user", "Purple");
		replacements.put("today", String.valueOf(new Date()));
		email.setReplacements(replacements);
	 
		sms.setSender("AKSTRHLTH");
		sms.setNumber("872655353");
		sms.setIsBulk("No");		
		SMSGroup smsgroup = new SMSGroup();
		smsgroup.setGroupId("Tstusrs");
		smsgroup.setGroupName("Testusers");
		sms.setSmsgroup(smsgroup);
		notification.setEmail(email);
		notification.setSms(sms);
     ObjectMapper Obj = new ObjectMapper();
     try { 
    	  
         // get Oraganisation object as a json string 
         String jsonStr = Obj.writeValueAsString(notification); 

         // Displaying JSON String 
         System.out.println(jsonStr); 
     } 

     catch (IOException e) { 
         e.printStackTrace(); 
     } 
}}
