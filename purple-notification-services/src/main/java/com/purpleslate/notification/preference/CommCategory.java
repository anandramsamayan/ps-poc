package com.purpleslate.notification.preference;

import java.util.ArrayList;
import java.util.List;

public class CommCategory {

	private String id;
	private String type;//promotional,transaction/user provided
	private String mode;//Sync,Async,scheduled(onetime/standing instruction) online/batch
	private String isfutureDateSupported;
	private String deliveryReceiptRequired;
	private String failoverCallbackUrl;
	private String retryRequired;
	private String[] blocklist = new String[10];
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getIsfutureDateSupported() {
		return isfutureDateSupported;
	}
	public void setIsfutureDateSupported(String isfutureDateSupported) {
		this.isfutureDateSupported = isfutureDateSupported;
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
	
	
}
