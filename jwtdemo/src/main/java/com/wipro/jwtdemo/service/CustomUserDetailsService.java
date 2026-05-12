package com.wipro.jwtdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.wipro.jwtdemo.entity.UserCred;
import com.wipro.jwtdemo.repo.UserCredRepo;
 
@Service
public class CustomUserDetailsService
        implements UserDetailsService {

    @Autowired
    private UserCredRepo repo;

    public UserDetails loadUserByUsername(
            String username)
            throws UsernameNotFoundException {

        UserCred user = repo.findByUserName(username);
                 

        return org.springframework.security.core.userdetails.User
                .builder()
                .username(user.getUserName())
                .password(user.getUserPass())
                .roles(user.getUserRole())
                .build();
    }
}