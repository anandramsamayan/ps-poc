package com.purpleslate.notification.dal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class MsgTypeToTemplateMapperVO {

	@Id
	private String id;
	private String clientId;
	private String msgId;
	private String templateIds;
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
	public String getTemplateIds() {
		return templateIds;
	}
	public void setTemplateIds(String templateIds) {
		this.templateIds = templateIds;
	}
	
}
