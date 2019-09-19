package com.poc.mongodb.mongodbtest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.poc.mongodb.mongodbtest.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {
	
}
