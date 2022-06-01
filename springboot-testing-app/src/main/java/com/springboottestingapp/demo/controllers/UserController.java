package com.springboottestingapp.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboottestingapp.demo.service.UserService;

@Controller
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@RequestMapping("/sendSms")
	public @ResponseBody String send() {
		return userService.sendMessage("Hi");
	}


	@GetMapping("/home")
	public @ResponseBody String home() {
		return "home";
	}


}