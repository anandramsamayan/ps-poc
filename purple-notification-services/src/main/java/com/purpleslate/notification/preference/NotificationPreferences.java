package com.purpleslate.notification.preference;

import java.util.ArrayList;
import java.util.List;

public class NotificationPreferences {

	private String clientid;
	private String fromId;
	private String prefPartner;
	private String commMode;
	private String clientname;
	private String deliveryReceiptRequired;
	private String failoverCallbackUrl;
	private String workingHours;
	private String isDNDEnabledOffBusshrs;
	private List<CommChannel> channelsOpted = new ArrayList<CommChannel>();
	private List<CommCategory> commCategorys = new ArrayList<CommCategory>();
	private List<MsgType> msgTypes = new ArrayList<MsgType>();
	public String getClientid() {
		return clientid;
	}
	public void setClientid(String clientid) {
		this.clientid = clientid;
	}
	public String getFromId() {
		return fromId;
	}
	public void setFromId(String fromId) {
		this.fromId = fromId;
	}
	public String getPrefPartner() {
		return prefPartner;
	}
	public void setPrefPartner(String prefPartner) {
		this.prefPartner = prefPartner;
	}
	public String getCommMode() {
		return commMode;
	}
	public void setCommMode(String commMode) {
		this.commMode = commMode;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
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
	public String getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
	}
	public String getIsDNDEnabledOffBusshrs() {
		return isDNDEnabledOffBusshrs;
	}
	public void setIsDNDEnabledOffBusshrs(String isDNDEnabledOffBusshrs) {
		this.isDNDEnabledOffBusshrs = isDNDEnabledOffBusshrs;
	}
	public List<CommChannel> getChannelsOpted() {
		return channelsOpted;
	}
	public void setChannelsOpted(List<CommChannel> channelsOpted) {
		this.channelsOpted = channelsOpted;
	}
	public List<CommCategory> getCommCategorys() {
		return commCategorys;
	}
	public void setCommCategorys(List<CommCategory> commCategorys) {
		this.commCategorys = commCategorys;
	}
	public List<MsgType> getMsgTypes() {
		return msgTypes;
	}
	public void setMsgTypes(List<MsgType> msgTypes) {
		this.msgTypes = msgTypes;
	}
	
	
	
	
	
}
