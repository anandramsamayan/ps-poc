package com.purpleslate.notification.service;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;

import com.sendgrid.*;

public class Sendgridmailer {
  public static void main(String[] args) throws IOException {
    Email from = new Email("admin@abcHealth.com");
    String subject = "General Broadcast";
    Email to = new Email("anandram.samayan@gmail.com");
    EmailTemplate template = new EmailTemplate("welcome-plain.txt");

	Map<String, String> replacements = new HashMap<String, String>();
	replacements.put("user", "Purple");
	replacements.put("today", String.valueOf(new Date()));

	String message = template.getTemplate(replacements);
    Content content = new Content("text/plain", message);
    Mail mail = new Mail(from, subject, to, content);
    
    
    File file = new File("sample.pdf");
	   byte[] filedata=IOUtils.toByteArray(new FileInputStream(file));
	  Base64 x = new Base64();
	 String imageDataString = x.encodeAsString(filedata);
	 Attachments attachments3 = new Attachments();
    attachments3.setContent(imageDataString);
    attachments3.setType("application/pdf");//"application/pdf"
    attachments3.setFilename("ticket.pdf");
    attachments3.setDisposition("attachment");
    attachments3.setContentId("Banner");
    mail.addAttachments(attachments3);

    
    SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
    Request request = new Request();
    try {
      request.setMethod(Method.POST);
      request.setEndpoint("mail/send");
      request.setBody(mail.build());
      Response response = sg.api(request);
      System.out.println(response.getStatusCode());
      System.out.println(response.getBody());
      System.out.println(response.getHeaders());
    } catch (IOException ex) {
      throw ex;
    }
  }
  
  public static String sendMailer(com.purpleslate.notification.fo.Email email,String contentTemplate) throws IOException 
  {
	    Email from = new Email(email.getFrom());
	    String subject = email.getSubject();
	    Email to = new Email(email.getTo().get(0));
	    EmailTemplate template = new EmailTemplate("welcome-plain.txt");
	    email.getReplacements();
	    
		Map<String, String> replacements = email.getReplacements();//new HashMap<String, String>();
		//replacements.put("user", "Purple");
		//replacements.put("today", String.valueOf(new Date()));

		String message = template.getTemplate(contentTemplate,replacements);
	    Content content = new Content("text/plain", message);
	    Mail mail = new Mail(from, subject, to, content);
	
	    SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
	    Request request = new Request();
	    try {
	      request.setMethod(Method.POST);
	      request.setEndpoint("mail/send");
	      request.setBody(mail.build());
	      Response response = sg.api(request);
	      System.out.println(response.getStatusCode());
	      System.out.println(response.getBody());
	      System.out.println(response.getHeaders());
	    } catch (IOException ex) {
	      throw ex;
	    }
	  
	  
	  return "Success";
  }
  
}
