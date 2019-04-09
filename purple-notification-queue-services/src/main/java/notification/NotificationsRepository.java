package notification;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface NotificationsRepository extends MongoRepository<NotificationVO, String> {
}
