package notification;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Component
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
	public List<NotificationVO> getAllSubmittedAsyncNotifications() {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("status").is("Submitted"));
		List<NotificationVO> notificationVOList = mongoTemplate.find(query, NotificationVO.class);
		return notificationVOList;
		
	}

}
