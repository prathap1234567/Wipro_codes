package com.wipro.studentreg.serviceimpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.wipro.studentreg.entity.Mobile;
import com.wipro.studentreg.mobilerepo.MobileRepo;
import com.wipro.studentreg.service.MobileService;


@Service
public class MobileServiceImpl implements MobileService{

	
	@Autowired
	MobileRepo mobileRepo;

	@Override
	public List<Mobile> findAll() {
		// TODO Auto-generated method stub
		return mobileRepo.findAll(Sort.by(Sort.Direction.DESC,"model").and(Sort.by(Sort.Direction.DESC,"id")));
	}

	@Override
	public Optional<Mobile> findById(int id) {
		// TODO Auto-generated method stub
		return mobileRepo.findById(id);
	}

	@Override
	public String update(Mobile m) {
		// TODO Auto-generated method stub
		 mobileRepo.save(m);
		return "data updated";
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		mobileRepo.deleteById(id);
		
	}

	@Override
	public void save(Mobile m) {
		// TODO Auto-generated method stub
		mobileRepo.save(m);
		
	}

	@Override
	public void saveBulk(List<Mobile> list) {
		// TODO Auto-generated method stub
		mobileRepo.saveAll(list);
		
	}

	@Override
	public List<Mobile> findByMake(String make) {
		// TODO Auto-generated method stub
		return mobileRepo.findByMake(make);
	}

	@Override
	public List<Mobile> findByMakeAndPrice(String make, double price) {
		// TODO Auto-generated method stub
		return mobileRepo.findByMakeAndPrice(make, price);
	}

	@Override
	public List<Mobile> findWithMobile(String make) {
		// TODO Auto-generated method stub
		return mobileRepo.findWithMovie(make);
	}

	@Override
	public Page<Mobile> findAllByPage(Pageable p) {
		// TODO Auto-generated method stub
		return mobileRepo.findAll(p);
	}

}
