package com.wipro.hibernattest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.hib.entity.Bank;
import com.wipro.hib.entity.Customer;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	 Bank  b1=new Bank(254786,"Saving");
	 Bank  b2=new Bank(256776,"Current");
	 Bank  b3=new Bank(788785,"Current");
	 Customer c1=new Customer();
	 c1.setName("Rajesh");
	 c1.setBank("SBI");
	 
	 Customer c2=new Customer();
	 c2.setName("Gokul");
	 c2.setbank("IOB");
	 SessionFactory factory =
             new Configuration()
                     .configure()
                     .buildSessionFactory();
		
		
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.persist(b1);
		session.persist(b2);
		session.persist(b3);
		c1.getBank().add(b1);
		c1.getBank().add(b2);		
		session.persist(b1);
		
		c2.getBank().add(b2);
		c2.getBank().add(b3);
		session.persist(c2);
		t.commit();


	}

}
