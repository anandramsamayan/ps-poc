package com.purpleslate.notification.api;

import com.purpleslate.notification.fo.Notification;
import com.purpleslate.notification.fo.NotificationResponce;
import com.purpleslate.notification.fo.SMSContacts;
import com.purpleslate.notification.fo.SMSGroup;

public interface SMSNotification {

	public NotificationResponce sendSms(Notification notification);
	public NotificationResponce getInboxes(Notification notification);//get inbox ids
	public NotificationResponce receiveMessageFromInbox(Notification notification,String inboxId);
	public NotificationResponce createGroup(Notification notification);
	public SMSGroup[] getSMSGroups(Notification notification);
	public SMSContacts[] getSMSContacts(Notification notification,String groupId);
	public String getSMSTemplates(Notification notification);
}
