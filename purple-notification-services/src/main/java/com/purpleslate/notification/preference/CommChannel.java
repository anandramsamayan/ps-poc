package com.purpleslate.notification.preference;

import java.util.ArrayList;
import java.util.List;

public class CommChannel {

	private String id;//id
	private String name;//Mailing,text
	private String mode;//=sync,Async,Mixed
	private String prefPartner;//=sendgrid
	private String apiKey;//channel partner key
	private String commEndPoint;
	private String retryAllowed;
	private String billingInfoRequired;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getPrefPartner() {
		return prefPartner;
	}
	public void setPrefPartner(String prefPartner) {
		this.prefPartner = prefPartner;
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
	public String getRetryAllowed() {
		return retryAllowed;
	}
	public void setRetryAllowed(String retryAllowed) {
		this.retryAllowed = retryAllowed;
	}
	public String getBillingInfoRequired() {
		return billingInfoRequired;
	}
	public void setBillingInfoRequired(String billingInfoRequired) {
		this.billingInfoRequired = billingInfoRequired;
	}
	
	
	
		   
}
