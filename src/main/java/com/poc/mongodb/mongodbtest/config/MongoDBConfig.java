package com.poc.mongodb.mongodbtest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.poc.mongodb.mongodbtest")
@Configuration
public class MongoDBConfig {

}
