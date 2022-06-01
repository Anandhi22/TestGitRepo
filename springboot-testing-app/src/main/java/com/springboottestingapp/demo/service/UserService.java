package com.springboottestingapp.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboottestingapp.demo.models.User;
import com.springboottestingapp.demo.repository.UserRepository;
import com.springboottestingapp.demo.utils.SendSmsUtil;



@Service
public class UserService {
	
	@Autowired // uses setter injection
	private SendSmsUtil demoUtil;
	
	@Autowired
	private UserRepository userRepository;
	
	public String sendMessage(String message) {
	return "SMS Sent!";
	}
	
	public void addUser(String name) {
		User user = new User(name);
		this.userRepository.createUser(user);
	}
	
	public User getUserDetails(String name) {
		return this.userRepository.findUser(name);
	}

}