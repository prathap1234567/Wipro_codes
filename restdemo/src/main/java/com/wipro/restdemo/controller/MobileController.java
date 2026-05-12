package com.wipro.restdemo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.restdemo.entity.Mobile;
import com.wipro.restdemo.repo.MobileRepov1;
import com.wipro.restdemo.service.MobileService;
import org.springframework.data.domain.Pageable;
@RestController
@RequestMapping("/mobile")
public class MobileController {
	@Autowired
	MobileService mobileService;
	@GetMapping
	ResponseEntity<List<Mobile>> getMobile() {

		List<Mobile> list = mobileService.findAll();

		if(list.size() == 0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.header("Data-Status", "List Empty")
					.header("Data-Size", "0")
					.body(null);
		}
		else
		{
			return ResponseEntity.status(HttpStatus.OK)
					.header("Data-Status", "List Returned")
					.header("Data-Size", "Size Not Zero")
					.body(list);
		}
	}
		@GetMapping("/{id}")
		Mobile findById(@PathVariable int id) {
			Optional<Mobile> opt=mobileService.findById(id);
			if (opt.isPresent()) {
				return opt.get();
			} else {
				return new Mobile();
			}
		
		}

	@PutMapping
	String putMake(@RequestBody Mobile m) {
		  return mobileService.update(m);
	}
	@PostMapping
	String postMake(@RequestBody Mobile m) {
		m.setId(0);
		mobileService.save(m);
		  return "Added Successfully";
	}
	@DeleteMapping("/{id}")
	String deleteMake(@PathVariable int id) {
		mobileService.deleteById(id);
		  return "Deleted Successfully";
	}
	@PostMapping("/saveall")
	void saveAll(@RequestBody List<Mobile> list) {
		List<Mobile> newList=new ArrayList();
		for(Mobile m:list) {
			m.setId(0);
			newList.add(m);
		}
		mobileService.saveBulk(newList);
	
	}
	@GetMapping("/make")
	List<Mobile> findByMake(@RequestParam(name="m") String make){
		return mobileService.findByMake(make);
	}
	@GetMapping("/makeprice")
	List<Mobile> findByMakeAndPrice(@RequestParam(name="p")String make,@RequestParam(name="n")double price)
	{
		return mobileService.findByMakeAndPrice(make, price);
	}
	@GetMapping("/mmake")
	List<Mobile> findWithMake(@RequestParam("n") String mMake)
	{
		
		return mobileService.findWithMobile(mMake);
	}
	
	@GetMapping("/pg")
	public Page<Mobile> findAllByPage(@RequestParam("pn")int pageNumber,@RequestParam("sz") int pageSize,@RequestParam("srt") String sortDir)
	{
		Sort sort=null;
		if(sortDir.equalsIgnoreCase("a")) {
			sort=Sort.by("id").ascending();
		}
		else {
			sort=Sort.by("id").descending();
		}
		System.out.println(sort);
		Pageable p=PageRequest.of(pageNumber, pageSize).withSort(sort);
		return mobileService.findAllByPage(p);
	}
}
