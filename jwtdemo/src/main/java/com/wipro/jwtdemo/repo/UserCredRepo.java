package com.wipro.jwtdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.jwtdemo.entity.UserCred;

@Repository
public interface UserCredRepo  extends JpaRepository<UserCred, Integer>{

	UserCred findByUserName(String userName);
}
