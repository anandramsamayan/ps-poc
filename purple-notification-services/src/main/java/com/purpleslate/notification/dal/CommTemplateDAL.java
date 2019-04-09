package com.purpleslate.notification.dal;

import java.util.List;



public interface CommTemplateDAL {

	List<CommTemplateVO> getAllMsgTemplateMappers();

	List<CommTemplateVO> getMsgTemplateMappersByClientId(String clientId);

	
}