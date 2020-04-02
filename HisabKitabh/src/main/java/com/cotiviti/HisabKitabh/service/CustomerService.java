package com.cotiviti.HisabKitabh.service;


import java.util.List;
import java.util.Optional;

import com.cotiviti.HisabKitabh.models.Customer;



public interface CustomerService {

	List<Customer> findAll();
	
	Optional<Customer> findById(Integer Id);
	
	Customer save(Customer customer);
	
	void deleteById(Integer id);
	
	List<Customer> findByNameIgnoreCase(String str1);




}
