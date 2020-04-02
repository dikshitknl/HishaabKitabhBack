package com.cotiviti.HisabKitabh.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotiviti.HisabKitabh.models.Customer;

import com.cotiviti.HisabKitabh.repository.CustomerRepo;
import com.cotiviti.HisabKitabh.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}

	@Override
	public Customer save(Customer customer) {
		return customerRepo.save(customer);
	}

	@Override
	public void deleteById(Integer id) {
		customerRepo.deleteById(id);
	}

	@Override
	public List<Customer> findByNameIgnoreCase(String str1) {
		return customerRepo.findByNameIgnoreCase(str1);
	}

	@Override
	public Optional<Customer> findById(Integer id) {
		return customerRepo.findById(id);
	}

}
