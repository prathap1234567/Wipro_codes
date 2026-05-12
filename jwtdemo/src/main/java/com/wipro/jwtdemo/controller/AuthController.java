package com.wipro.jwtdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.jwtdemo.entity.UserCred;
import com.wipro.jwtdemo.repo.UserCredRepo;
import com.wipro.jwtdemo.util.JwtUtil;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


@RestController
@RequestMapping("/auth")
public class AuthController {
	@Autowired
	UserCredRepo userCredRepo;
	@Autowired
	PasswordEncoder passwordEncoder;
   @Autowired
   private AuthenticationManager authManager;
	  @Autowired
	   private JwtUtil jwtUtil;
	@Operation(method="post",summary="This API is used to register a User")	
	@ApiResponses(value= {
			@ApiResponse(responseCode = "201", description = "Successfully Registering User"),
			@ApiResponse(responseCode = "500", description = "Server Error")

	})
	@PostMapping("/register")	
	ResponseEntity<String> register(@RequestBody UserCred user)
	{
		System.out.println("--register--");
		String encryptedPass=passwordEncoder.encode(user.getUserPass());
		user.setUserPass(encryptedPass);
		userCredRepo.save(user);		
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body("User Registred Sucessfully");
	}
	@ApiResponses(value= {
			@ApiResponse(responseCode = "200", description = "Successfully logged In"),
			@ApiResponse(responseCode = "400", description = "User Not found")		
	})
	@PostMapping("/login")	
	ResponseEntity<String> login(@RequestBody UserCred user)
	{
		System.out.println("--Login--"+user);
		String token=null;
		   Authentication authentication =
	                authManager.authenticate(
	                        new UsernamePasswordAuthenticationToken(
	                        		user.getUserName(),
	                        		user.getUserPass()));

		   System.out.println("authentication.isAuthenticated()="+authentication.isAuthenticated());
	        if(authentication.isAuthenticated()) {

	        	token=jwtUtil.generateToken(
	                    user.getUserName());
	        }
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(token);
	}

	

}