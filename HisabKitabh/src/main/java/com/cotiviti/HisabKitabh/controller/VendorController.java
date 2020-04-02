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

import com.cotiviti.HisabKitabh.models.Vendor;
import com.cotiviti.HisabKitabh.service.VendorService;

@RestController
@CrossOrigin()
public class VendorController {

	@Autowired
	private VendorService vendorService;
	
	@GetMapping("/vendors/{id}")
	public ResponseEntity<Optional<Vendor>> vendorDetail(@PathVariable int id) {
		Optional<Vendor> vendor = vendorService.findById(id);
		return new ResponseEntity<Optional<Vendor>>(vendor, HttpStatus.OK);
	}

	@GetMapping("/vendors")
	public ResponseEntity<List<Vendor>> vendorList(@RequestParam(required = false) String q) {
		List<Vendor> vendors;
		if (q == null) {
			vendors = vendorService.findAll();
		} else {
			vendors = vendorService.findByNameIgnoreCase(q);
		}
		return new ResponseEntity<List<Vendor>>(vendors, HttpStatus.OK);
	}

	@PostMapping("/vendors")
	public ResponseEntity<Vendor> vendorcreate(@RequestBody Vendor vendor) {
		Vendor vendorTemp = vendorService.save(vendor);
		return new ResponseEntity<Vendor>(vendorTemp, HttpStatus.OK);
	}

	@DeleteMapping("/vendors/{id}")
	void vendorDelete(@PathVariable int id) {
		vendorService.deleteById(id);
	}

	
}
