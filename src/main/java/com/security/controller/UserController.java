package com.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.model.User;
import com.security.repository.UserRepository;
import com.security.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/signUp")
	public ResponseEntity<User> createUser(@RequestBody User entity) {
		
		service.createUser(entity);
		
		return ResponseEntity.ok(entity);
	}
	
	
	@GetMapping
	public ResponseEntity<List<User>> getUsers(){
		
		List<User> users = service.gatAllUsers();
		return ResponseEntity.ok(users);
	}

}
