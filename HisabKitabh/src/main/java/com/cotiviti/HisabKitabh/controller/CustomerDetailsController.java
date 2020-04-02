package com.cotiviti.HisabKitabh.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cotiviti.HisabKitabh.models.Customer;
import com.cotiviti.HisabKitabh.service.CustomerService;

@RestController
@CrossOrigin()
public class CustomerDetailsController {

	@Autowired
	private CustomerService customerService;
	

	@GetMapping("/customers/{id}")
	public ResponseEntity<Optional<Customer>> customerDetail(@PathVariable int id) {
		Optional<Customer> customer = customerService.findById(id);
		return new ResponseEntity<Optional<Customer>>(customer, HttpStatus.OK);
	}

	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> customerList(@RequestParam(required = false) String q) {
		List<Customer> customers;
		if (q == null) {
			customers = customerService.findAll();
		} else {
			customers = customerService.findByNameIgnoreCase(q);
		}
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}

	@PostMapping("/customers")
	public ResponseEntity<Customer> customercreate(@RequestBody Customer customer) {
		System.out.println("FUCK");
		Customer customerTemp = customerService.save(customer);
		return new ResponseEntity<Customer>(customerTemp, HttpStatus.OK);
	}

	@DeleteMapping("/customers/{id}")
	void vendorDelete(@PathVariable int id) {
		customerService.deleteById(id);
	}

}
