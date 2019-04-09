/**
 * 
 */
package com.purpleslate.notification.dal;

import java.util.List;



/**
 * @author HP
 *
 */


public interface NotificationsDAL {

	List<NotificationVO> getAllFuturedatedNotifications();
	
	void insertNotification(NotificationVO notificationVO);
	
	NotificationVO updateSubmittedAsyncNotifications(NotificationVO notificationVO);

	
}
