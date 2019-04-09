package notification;

import java.util.List;



public interface NotificationPreferencesDAL {

	List<NotificationPreferences> getAllClientsUserPreference();

	NotificationPreferences getNotificationPreferencesById(String clientId);

	
}