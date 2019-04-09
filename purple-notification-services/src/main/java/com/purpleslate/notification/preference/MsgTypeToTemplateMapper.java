package com.purpleslate.notification.preference;

import java.util.ArrayList;
import java.util.List;

public class MsgTypeToTemplateMapper {

	private String id;
	private String clientId;
	private String msgId;
	private List<String> templateIds = new ArrayList<String>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	public List<String> getTemplateIds() {
		return templateIds;
	}
	public void setTemplateIds(List<String> templateIds) {
		this.templateIds = templateIds;
	}
}
