package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Customer;
import com.spring.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	/* Autowired member variable */
	//@Autowired 
	private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We are using constructor Injection");
		this.customerRepository = customerRepository;
	}
	
	/* Autowired setter Injection */
	//@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("using setter Injection");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
}
