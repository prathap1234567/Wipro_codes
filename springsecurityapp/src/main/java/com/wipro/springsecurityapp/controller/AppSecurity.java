package com.wipro.springsecurityapp.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AppSecurity {

	@Bean
	SecurityFilterChain security(HttpSecurity httpSecurity) {
		try {
		return httpSecurity.authorizeHttpRequests(
				http->http
				.requestMatchers("/auth/**")
				.permitAll()
				.anyRequest()
				.authenticated()
				).formLogin(Customizer.withDefaults())
				.httpBasic(Customizer.withDefaults())
				.build();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return null;

	}
	
}
