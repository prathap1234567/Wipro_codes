package com.wipro.jwtdemo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

 

@Configuration
@EnableWebSecurity
public class Appsecurity {

	   @Autowired
	    private JwtFilter jwtFilter;

	 

	    //Password Encoder
	    @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }

	    //Authentication Manager
	    @Bean
	    public AuthenticationManager authenticationManager(
	            AuthenticationConfiguration config)
	            throws Exception {

	        return config.getAuthenticationManager();
	    }

	    // Security Configuration
	    @Bean
	    public SecurityFilterChain securityFilterChain(
	            HttpSecurity http)
	            throws Exception {
	    	System.out.println("---Filter Chain--");
	        http

	            // Disable CSRF
	            .csrf(csrf -> csrf.disable())

	            // Authorization Rules
	            .authorizeHttpRequests(auth -> auth

	                    // Public APIs
	            		.requestMatchers(
	                            "/auth/login",
	                            "/auth/register","/swagger-ui/**","/api-docs/**")
	                    .permitAll()

	                    // All other APIs secured
	                    .anyRequest()
	                    .authenticated())

	            // Stateless Session
	            .sessionManagement(session ->
	                    session.sessionCreationPolicy(
	                            SessionCreationPolicy.STATELESS))

	            // Add JWT Filter
	            .addFilterBefore(
	                    jwtFilter,
	                    UsernamePasswordAuthenticationFilter.class);

	        return http.build();
	
}
}
