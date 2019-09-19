package com.poc.mongodb.mongodbtest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.mongodb.mongodbtest.model.User;
import com.poc.mongodb.mongodbtest.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@PostMapping("/save-user")
	public ResponseEntity<User> save(@RequestBody User user) {
		User savedUser = userRepository.save(user);
		return ResponseEntity.status(HttpStatus.OK).body(savedUser);
	}

	@GetMapping("getAllUsers")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	@GetMapping("getAllUsers/{id}")
	public Optional<User> getUser(@PathVariable Long id) {
		return userRepository.findById(id);
	}
	
	@DeleteMapping("deleteUser/{id}")
	public String deleteUser(@PathVariable Long id) {
		userRepository.deleteById(id);
		return "User has been deleted! Id:- "+id;
	}
	
}
