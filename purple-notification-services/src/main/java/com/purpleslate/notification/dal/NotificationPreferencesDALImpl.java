package com.purpleslate.notification.dal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;



@Repository
public class NotificationPreferencesDALImpl implements NotificationPreferencesDAL {

	@Autowired
	private MongoTemplate mongoTemplate;

	

	@Override
	public List<NotificationPreferences> getAllClientsUserPreference() {
		return mongoTemplate.findAll(NotificationPreferences.class);
	}

	@Override
	public NotificationPreferences getNotificationPreferencesById(String clientId) {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("clientId").is(clientId));
		return mongoTemplate.findOne(query, NotificationPreferences.class);
		
	}

}
