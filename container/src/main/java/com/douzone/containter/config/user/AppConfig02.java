package com.douzone.containter.config.user;

import org.springframework.context.annotation.Bean;

import com.douzone.container.user.User;

public class AppConfig02 {
	@Bean	
	public User user() {
		return new User();
	}
}
