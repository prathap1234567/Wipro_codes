package com.wipro.hib.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bank")

public class Bank {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int id;
	public Bank(int accnum, String accType) {
		super();
		this.accnum = accnum;
		this.accType = accType;
	}
	@Column(name="acc_num")
	int accnum;
	@Column(name="acc_type")
    String accType;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccnum() {
		return accnum;
	}
	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", accnum=" + accnum + ", accType=" + accType + "]";
	}
	
}
