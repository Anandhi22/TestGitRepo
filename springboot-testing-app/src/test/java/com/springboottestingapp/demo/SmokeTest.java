package com.springboottestingapp.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboottestingapp.demo.controllers.UserController;


@SpringBootTest
public class SmokeTest {

	@Autowired
	private UserController userController;

	@Test
	public void contextLoads() throws Exception {
		assertThat(userController).isNotNull();
	}
}
 
