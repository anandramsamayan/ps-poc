package com.purpleslate.notification.model;

import java.util.ArrayList;
import java.util.List;

public class CommCategory {

	private String type;//promotional,transaction
	private String mode;//Sync,Async,scheduled(onetime/standing instruction)
	private String futureDate;
	private String deliveryReceiptRequired;
	private String failoverCallbackUrl;
	private String retryRequired;
	private List<CommTemplate> comTemplates = new ArrayList();
	private String[] blocklist = new String[10];
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
	public String getFutureDate() {
		return futureDate;
	}
	public void setFutureDate(String futureDate) {
		this.futureDate = futureDate;
	}
	public String getDeliveryReceiptRequired() {
		return deliveryReceiptRequired;
	}
	public void setDeliveryReceiptRequired(String deliveryReceiptRequired) {
		this.deliveryReceiptRequired = deliveryReceiptRequired;
	}
	public String getFailoverCallbackUrl() {
		return failoverCallbackUrl;
	}
	public void setFailoverCallbackUrl(String failoverCallbackUrl) {
		this.failoverCallbackUrl = failoverCallbackUrl;
	}
	public String getRetryRequired() {
		return retryRequired;
	}
	public void setRetryRequired(String retryRequired) {
		this.retryRequired = retryRequired;
	}
	
	public String[] getBlocklist() {
		return blocklist;
	}
	public void setBlocklist(String[] blocklist) {
		this.blocklist = blocklist;
	}
	public List<CommTemplate> getComTemplates() {
		return comTemplates;
	}
	public void setComTemplates(List<CommTemplate> comTemplates) {
		this.comTemplates = comTemplates;
	}
	
}
