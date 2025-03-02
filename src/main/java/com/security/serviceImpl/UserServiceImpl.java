package com.security.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.model.User;
import com.security.repository.UserRepository;
import com.security.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository repository;

	@Override
	public User createUser(User user) {
		repository.save(user);
		return null;
	}

	@Override
	public List<User> gatAllUsers() {
		
		return repository.findAll();
	}

	@Override
	public List<User> gatUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
