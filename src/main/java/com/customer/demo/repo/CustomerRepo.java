package com.customer.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.demo.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	
}
