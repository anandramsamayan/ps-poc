package com.purpleslate.notification.dal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;



@Repository
public class MsgTypeToTemplateMapperDALImpl implements MsgTypeToTemplateMapperDAL {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public List<MsgTypeToTemplateMapperVO> getAllMsgTemplateMappers() {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(MsgTypeToTemplateMapperVO.class);
	}

	@Override
	public List<MsgTypeToTemplateMapperVO> getMsgTemplateMappersByClientId(String clientId) {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("clientId").is(clientId));
		return mongoTemplate.find(query, MsgTypeToTemplateMapperVO.class);
	}

	
	
}
