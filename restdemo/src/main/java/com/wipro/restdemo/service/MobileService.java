package com.wipro.restdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wipro.restdemo.entity.Mobile;

public interface MobileService {

	List<Mobile> findAll();
	Optional<Mobile> findById(int id);
	String update (Mobile m);
	void deleteById(int id);
	void save(Mobile m);
	void saveBulk(List<Mobile> list);
	//List<Mobile> findByMake1(String make);
	List<Mobile> findByMakeAndPrice(String make,double price);
	List<Mobile> findWithMobile(String make);
	Page<Mobile> findAllByPage(Pageable p);
	List<Mobile> findByMake(String make);
}
