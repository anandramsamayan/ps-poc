package com.purpleslate.notification.dal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class NotificationPreferences {

	@Id
	private String id;
	private String clientId;
	private String clientname;
	private String clientPrefJSON;
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public String getClientPrefJSON() {
		return clientPrefJSON;
	}
	public void setClientPrefJSON(String clientPrefJSON) {
		this.clientPrefJSON = clientPrefJSON;
	}
	
	
	
	
	
}
