package com.purpleslate.notification.model;

import java.util.ArrayList;
import java.util.List;

public class CommChannel {

	private String name;//Mailing,text
	private String mode;//=sync,Async,Mixed
	private String prefPartner;//=sendgrid
	private String apiKey;//channel partner key
	
	private List<CommCategory> commCategorys = new ArrayList();
	private String billingInfoRequired;
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
	public String getBillingInfoRequired() {
		return billingInfoRequired;
	}
	public void setBillingInfoRequired(String billingInfoRequired) {
		this.billingInfoRequired = billingInfoRequired;
	}
	public List<CommCategory> getCommCategorys() {
		return commCategorys;
	}
	public void setCommCategorys(List<CommCategory> commCategorys) {
		this.commCategorys = commCategorys;
	}
		   
}
