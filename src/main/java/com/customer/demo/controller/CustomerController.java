package com.customer.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.demo.entity.Customer;
import com.customer.demo.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService cusSer;
	@PostMapping("/custm/data/add")
	public String addNewCustomer(@RequestBody Customer cusData) {
		
		cusSer.saveCusNewRecord(cusData);
		return "Successfully added new Record - - ->";
	}
	
	@PostMapping("/custm/data/add/all")
	public String addNewCustomer(@RequestBody List<Customer> cuslist) {
		
		cusSer.saveCusAllRecord(cuslist);
		return "Successfully added all Record - - ->";
	}
	
	

}
