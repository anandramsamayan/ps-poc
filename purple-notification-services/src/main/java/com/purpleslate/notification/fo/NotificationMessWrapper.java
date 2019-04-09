package com.purpleslate.notification.fo;

import java.util.HashMap;
import java.util.Map;

public class NotificationMessWrapper {

	Map<String,MessageFlow> messgFlowMap = new HashMap<String,MessageFlow>();

	public Map<String, MessageFlow> getMessgFlowMap() {
		return messgFlowMap;
	}

	public void setMessgFlowMap(Map<String, MessageFlow> messgFlowMap) {
		this.messgFlowMap = messgFlowMap;
	}
}
