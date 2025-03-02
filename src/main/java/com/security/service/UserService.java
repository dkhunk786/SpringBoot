package com.security.service;



import java.util.List;

import com.security.model.User;


public interface UserService {

	User createUser(User user);

	List<User> gatAllUsers();

}
