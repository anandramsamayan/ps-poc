package com.purpleslate.notification.fo;
import com.purpleslate.notification.preference.CommTemplate;

public class MessageFlow {

	private String channelName;
	private String mode;
	private String messageJson;
	private String messgProcessorName;
	private String isFutureDated;
	private String channelPartner;
	private String apiKey;
	private String commEndPoint;
    private String commCategoryType;
    private String statusToBeSet;
    private CommTemplate commTemplate;
    
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getMessageJson() {
		return messageJson;
	}
	public void setMessageJson(String messageJson) {
		this.messageJson = messageJson;
	}
	public String getMessgProcessorName() {
		return messgProcessorName;
	}
	public void setMessgProcessorName(String messgProcessorName) {
		this.messgProcessorName = messgProcessorName;
	}
	public String getIsFutureDated() {
		return isFutureDated;
	}
	public void setIsFutureDated(String isFutureDated) {
		this.isFutureDated = isFutureDated;
	}
	public String getChannelPartner() {
		return channelPartner;
	}
	public void setChannelPartner(String channelPartner) {
		this.channelPartner = channelPartner;
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getCommEndPoint() {
		return commEndPoint;
	}
	public void setCommEndPoint(String commEndPoint) {
		this.commEndPoint = commEndPoint;
	}
	public String getCommCategoryType() {
		return commCategoryType;
	}
	public void setCommCategoryType(String commCategoryType) {
		this.commCategoryType = commCategoryType;
	}
	public String getStatusToBeSet() {
		return statusToBeSet;
	}
	public void setStatusToBeSet(String statusToBeSet) {
		this.statusToBeSet = statusToBeSet;
	}
	public CommTemplate getCommTemplate() {
		return commTemplate;
	}
	public void setCommTemplate(CommTemplate commTemplate) {
		this.commTemplate = commTemplate;
	}
}
