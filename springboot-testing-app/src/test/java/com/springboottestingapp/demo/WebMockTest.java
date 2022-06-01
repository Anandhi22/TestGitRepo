package com.springboottestingapp.demo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.springboottestingapp.demo.controllers.UserController;
import com.springboottestingapp.demo.service.UserService;

@WebMvcTest(UserController.class)
public class WebMockTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private UserService userService;

	@Test
	public void testUserService() throws Exception {
		when(userService.sendMessage("Hi")).thenReturn("SMS Sent Successfully!");

		this.mockMvc.perform(get("/sendSms")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("SMS Sent Successfully!")));

	}
}