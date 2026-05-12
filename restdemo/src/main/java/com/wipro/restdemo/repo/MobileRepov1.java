package com.wipro.restdemo.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.wipro.restdemo.entity.Mobile;

@Repository
public class MobileRepov1 {

	List<Mobile> listMobile=new ArrayList<>();
	public MobileRepov1() {
		super();
		
	} 
	public List<Mobile> findAll(){
		return listMobile;
	}
	public Optional<Mobile> findById(int id){
		return listMobile
				.stream()
				.filter(m->m.getId()==id)
				.findFirst();
	}
	public void save(Mobile m) {
		listMobile.add(m);
	}
	public void DeleteById(int id){
		    listMobile=listMobile
				.stream()
				.filter(m->m.getId()!=id)
				.toList();
		System.out.println(listMobile);
	}
	public String update(Mobile m) {
		for(int i=0;i<listMobile.size();i++) {
			if(m.getId()==listMobile.get(i).getId()) {
				listMobile.set(i, m);
				return "Updated Successfully";
			}
		}
		return "Mobile Doesn't exist";
	}
}
