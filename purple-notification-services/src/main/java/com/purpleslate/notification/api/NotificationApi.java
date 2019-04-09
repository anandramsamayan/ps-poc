package com.purpleslate.notification.api;

import com.purpleslate.notification.fo.Notification;

public interface NotificationApi {

	
	public EmailNotification getEmailNotification();
	public SMSNotification getSMSNotification();
	
	
}
