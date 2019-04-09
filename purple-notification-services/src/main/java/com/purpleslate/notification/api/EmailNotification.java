package com.purpleslate.notification.api;

import com.purpleslate.notification.fo.Notification;
import com.purpleslate.notification.fo.NotificationResponce;

public interface EmailNotification {

	public NotificationResponce sendEmail(Notification notification);
	public NotificationResponce sendEmailWithTemplate(Notification notification);
}
