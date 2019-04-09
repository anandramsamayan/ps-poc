/**
 * 
 */
package notification;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author HP
 *
 */

@Component
public interface NotificationsDAL {

	List<NotificationVO> getAllFuturedatedNotifications();
	
	List<NotificationVO> getAllSubmittedAsyncNotifications();
	
	void insertNotification(NotificationVO notificationVO);
	


	
}
