package notification;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class NotificationVO {

	@Id
	private String id;
	private String messageId;
	private String clientId;
	private String type;//SMS/email	
	private String category;//priority(transactional)/promotional
	private String mode;//Sync/Async
	private String isFutureDated;
	private String futureDate;
	private String emailJson;
	private String smsJson;
	private String status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getIsFutureDated() {
		return isFutureDated;
	}
	public void setIsFutureDated(String isFutureDated) {
		this.isFutureDated = isFutureDated;
	}
	public String getFutureDate() {
		return futureDate;
	}
	public void setFutureDate(String futureDate) {
		this.futureDate = futureDate;
	}
	public String getEmailJson() {
		return emailJson;
	}
	public void setEmailJson(String emailJson) {
		this.emailJson = emailJson;
	}
	public String getSmsJson() {
		return smsJson;
	}
	public void setSmsJson(String smsJson) {
		this.smsJson = smsJson;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}

