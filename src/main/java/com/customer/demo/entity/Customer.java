package com.customer.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	int cusID;
	String name;
	String address;
	int mobNo;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCusID() {
		return cusID;
	}

	public void setCusID(int cusID) {
		this.cusID = cusID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobNo() {
		return mobNo;
	}

	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}

	@Override
	public String toString() {
		return "Customer [cusID=" + cusID + ", name=" + name + ", address=" + address + ", mobNo=" + mobNo + "]";
	}
	

}
