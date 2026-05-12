package com.wipro.studentreg.mobilerepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wipro.studentreg.entity.Mobile;

@Repository
public interface MobileRepo extends JpaRepository<Mobile,Integer>{
 
	
	List<Mobile> findByMake(String make);
	List<Mobile> findByMakeAndPrice(String make,double price);
	
	@Query("SELECT m from Mobile m where m.make=:mMake")
	List<Mobile> findWithMovie(@Param("mMake")  String make);

}
