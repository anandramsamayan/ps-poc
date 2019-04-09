package com.purpleslate.notification.dal;

import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;



@Repository
public class NotificationsDALImpl implements NotificationsDAL {

	@Autowired
	private MongoTemplate mongoTemplate;	

	@Override
	public List<NotificationVO> getAllFuturedatedNotifications() {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("isFutureDated").is("Yes"));
		return mongoTemplate.find(query, NotificationVO.class);
		
	}

	@Override
	public void insertNotification(NotificationVO notificationVO) {
		// TODO Auto-generated method stub
		mongoTemplate.save(notificationVO);
	}

	@Override
	public NotificationVO updateSubmittedAsyncNotifications(NotificationVO notificationVO) {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(notificationVO.getId()));
		query.fields().include("id");

		NotificationVO notificationVOdb = mongoTemplate.findOne(query, NotificationVO.class);
		System.out.println("notificationVOdb - " + notificationVOdb);

		Update update = new Update();
		update.set("status", "Processed");

		mongoTemplate.updateFirst(query, update, NotificationVO.class);

		//returns everything
		Query query1 = new Query();
		query1.addCriteria(Criteria.where("id").is(notificationVO.getId()));

		NotificationVO notificationVOUpdated = mongoTemplate.findOne(query1, NotificationVO.class);
		System.out.println("notificationVOUpdated - " + notificationVOUpdated);
		return notificationVOUpdated;
	}

}
