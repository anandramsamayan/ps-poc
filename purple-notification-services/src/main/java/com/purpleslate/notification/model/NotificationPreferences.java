package com.purpleslate.notification.model;

import java.util.ArrayList;
import java.util.List;

public class NotificationPreferences {

	private String clientname;
	private String clientid;
	
	private List<CommChannel> channelsOpted = new ArrayList();
	
	//global settings if client has all his channels under one profile
	private String prefPartner;
	private String commMode;
	private String deliveryReceiptRequired;
	private String failoverCallbackUrl;
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public String getClientid() {
		return clientid;
	}
	public void setClientid(String clientid) {
		this.clientid = clientid;
	}
	
	
	public String getCommMode() {
		return commMode;
	}
	public void setCommMode(String commMode) {
		this.commMode = commMode;
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
	public List<CommChannel> getChannelsOpted() {
		return channelsOpted;
	}
	public void setChannelsOpted(List<CommChannel> channelsOpted) {
		this.channelsOpted = channelsOpted;
	}
	public String getPrefPartner() {
		return prefPartner;
	}
	public void setPrefPartner(String prefPartner) {
		this.prefPartner = prefPartner;
	}
	
	
	
	
	
	
}
