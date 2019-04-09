package com.purpleslate.notification.preference;

import java.util.ArrayList;
import java.util.List;

public class MsgType {

	private String id;
	private String priorityId;
	private String deliveryReceiptRequired;
	private String retryRequired;
	private List<String> commChannelIds = new ArrayList<String>();
	private List<CommTemplate> commTemplates = new ArrayList<CommTemplate>();
	private String commCategoryId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPriorityId() {
		return priorityId;
	}
	public void setPriorityId(String priorityId) {
		this.priorityId = priorityId;
	}
	public String getDeliveryReceiptRequired() {
		return deliveryReceiptRequired;
	}
	public void setDeliveryReceiptRequired(String deliveryReceiptRequired) {
		this.deliveryReceiptRequired = deliveryReceiptRequired;
	}
	public String getRetryRequired() {
		return retryRequired;
	}
	public void setRetryRequired(String retryRequired) {
		this.retryRequired = retryRequired;
	}
	public List<String> getCommChannelIds() {
		return commChannelIds;
	}
	public void setCommChannelIds(List<String> commChannelIds) {
		this.commChannelIds = commChannelIds;
	}
	
	public String getCommCategoryId() {
		return commCategoryId;
	}
	public void setCommCategoryId(String commCategoryId) {
		this.commCategoryId = commCategoryId;
	}
	public List<CommTemplate> getCommTemplates() {
		return commTemplates;
	}
	public void setCommTemplates(List<CommTemplate> commTemplates) {
		this.commTemplates = commTemplates;
	}

}
