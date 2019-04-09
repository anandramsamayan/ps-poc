package com.purpleslate.notification.util;

import java.util.List;

import com.purpleslate.notification.fo.MessageFlow;
import com.purpleslate.notification.fo.NotificationMessWrapper;
import com.purpleslate.notification.preference.CommCategory;
import com.purpleslate.notification.preference.CommChannel;
import com.purpleslate.notification.preference.CommTemplate;
import com.purpleslate.notification.preference.MsgType;

public class NotoficationFlowUtil {

	public static NotificationMessWrapper constructNotificationMessWrapper(com.purpleslate.notification.preference.NotificationPreferences clientPreference)
	{
		NotificationMessWrapper notificationMessWrapper = new NotificationMessWrapper();
		
		notificationMessWrapper.getMessgFlowMap();
		
		
		
		List<MsgType> msgTypes = clientPreference.getMsgTypes();
        for(MsgType msgType: msgTypes)
        {MessageFlow messageFlow = null;
        
        	
        	for(CommChannel commChannel:clientPreference.getChannelsOpted())
        	{
        		for(String channelId:msgType.getCommChannelIds())
        		{	
        		if(commChannel.getId().equals(channelId))
        		{messageFlow =  new MessageFlow();
        		
        		List<CommTemplate> listCompTemplate = msgType.getCommTemplates();
        		for(CommTemplate commTemplate:listCompTemplate)
        		{
        			if(commTemplate.getChannelId().equals(channelId))
        			{
        				messageFlow.setCommTemplate(commTemplate);
        			}
        		}
        			messageFlow.setChannelName(commChannel.getName());
        			messageFlow.setChannelPartner(commChannel.getPrefPartner());
        			messageFlow.setApiKey(commChannel.getApiKey());
        			messageFlow.setCommEndPoint(commChannel.getCommEndPoint());
        			messageFlow.setMode("Sync");
        			messageFlow.setCommCategoryType("Transactional");
        			messageFlow.setStatusToBeSet("Processed");
        			if(notificationMessWrapper.getMessgFlowMap().get(msgType.getId()+"-channel-"+commChannel.getName())==null)
        			{
        				notificationMessWrapper.getMessgFlowMap().put(msgType.getId()+"-channel-"+commChannel.getName(), messageFlow);
        			}
        			
        		}
        		for(CommCategory commCategory:clientPreference.getCommCategorys())
            	{/*
            		if(commCategory.getId().equals(msgType.getCommCategoryId()))
            		{
            			notificationMessWrapper.getMessgFlowMap().get(msgType.getId()+"-channel-"+commChannel.getName()).setMode(commCategory.getMode());
            			notificationMessWrapper.getMessgFlowMap().get(msgType.getId()+"-channel-"+commChannel.getName()).setCommCategoryType(commCategory.getType());
            		if(commCategory.getMode().equals("Sync"))
            			notificationMessWrapper.getMessgFlowMap().get(msgType.getId()+"-channel-"+commChannel.getName()).setStatusToBeSet("Processed");
            		else
            			notificationMessWrapper.getMessgFlowMap().get(msgType.getId()+"-channel-"+commChannel.getName()).setStatusToBeSet("Submitted");
            		}
            	*/}
        		}
        	}
        	
        	
        	
        	//for(clientPreference.getCommCategorys())
        	
        }    	
		
		return notificationMessWrapper;
	}
}
