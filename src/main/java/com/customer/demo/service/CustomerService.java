package com.customer.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.demo.entity.Customer;
import com.customer.demo.repo.CustomerRepo;
@Service
public class CustomerService {
	
	@Autowired
	CustomerRepo cusRepo;
	
	public void saveCusNewRecord(Customer cusData) {
		
		cusRepo.save(cusData);
		
	}
	
	public void saveCusAllRecord(List<Customer> cuslist) {
		
		cusRepo.saveAll(cuslist);
		
	}

}
