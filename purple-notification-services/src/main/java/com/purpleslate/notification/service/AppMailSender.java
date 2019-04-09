
package com.purpleslate.notification.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.purpleslate.notification.fo.Email;
import com.purpleslate.notification.fo.Message;




@Component
public class AppMailSender  {

	@Autowired
	EmailService emailService;

	

	public void sendTextMail(Email email) {

		
		EmailTemplate template = new EmailTemplate("welcome-plain.txt");

		Map<String, String> replacements = new HashMap<String, String>();
		replacements.put("user", "Purple");
		replacements.put("today", String.valueOf(new Date()));

		String message = template.getTemplate(replacements);

		//email.setMessage(message);
		emailService.send(email)
		;
	}

	public void sendHtmltMail(Email email) {

		
		
		EmailTemplate template = new EmailTemplate("welcome.html");

		Map<String, String> replacements = new HashMap<String, String>();
		replacements.put("user", "Pavan");
		replacements.put("today", String.valueOf(new Date()));

		String message = template.getTemplate(replacements);

		
		email.setHtml(true);
		
		emailService.send(email);
	}

}
