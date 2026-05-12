package com.wipro.hib.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinTable;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;
@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int id;
	@Column(name="customer_name")
	String name;
	@Column(name="bank_name")
	String Bank;
	
	@JoinTable(
	        name = "customer_bank",
	        joinColumns = @JoinColumn(name = "customer_id"),
	        inverseJoinColumns = @JoinColumn(name = "bank_id")
	    )
	@ManyToMany(cascade=CascadeType.ALL)
	List<Bank> bank= new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Bank> getBank() {
		return bank;
	}



	public void setbank(List<Bank> bank) {
		this.bank = bank;
	}


	public void setBank(List<Bank> bank) {
		this.bank = bank;
	}

	public Customer(String name, String bank, List<com.wipro.hib.entity.Bank> bank2) {
		super();
		this.name = name;
		Bank = bank;
		
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", Bank=" + Bank + ", bank=" + bank + "]";
	}

	
	



}
