package com.radhika.journalApp.repository;

import com.radhika.journalApp.entity.JournalEntry;
import com.radhika.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    public User findByUserName(String username);

    void deleteByUserName(String username);

}
