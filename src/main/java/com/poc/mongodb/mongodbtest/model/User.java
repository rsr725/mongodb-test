package com.poc.mongodb.mongodbtest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "User")
public class User {
	@Id	
	private Long id;
	private String firstName;
	private String lastName;
	private String city;
}
