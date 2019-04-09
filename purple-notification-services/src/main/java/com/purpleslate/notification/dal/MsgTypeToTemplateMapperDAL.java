package com.purpleslate.notification.dal;

import java.util.List;



public interface MsgTypeToTemplateMapperDAL {

	List<MsgTypeToTemplateMapperVO> getAllMsgTemplateMappers();

	List<MsgTypeToTemplateMapperVO> getMsgTemplateMappersByClientId(String clientId);

	
}