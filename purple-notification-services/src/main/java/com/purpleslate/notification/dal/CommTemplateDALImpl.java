package com.purpleslate.notification.dal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;



@Repository
public class CommTemplateDALImpl implements CommTemplateDAL {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public List<CommTemplateVO> getAllMsgTemplateMappers() {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(CommTemplateVO.class);
	}

	@Override
	public List<CommTemplateVO> getMsgTemplateMappersByClientId(String clientId) {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("clientId").is(clientId));
		return mongoTemplate.find(query, CommTemplateVO.class);
	}

	
	
}
