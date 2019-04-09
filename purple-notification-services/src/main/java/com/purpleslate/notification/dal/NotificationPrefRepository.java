package com.purpleslate.notification.dal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface NotificationPrefRepository extends MongoRepository<NotificationPreferences, String> {
}
