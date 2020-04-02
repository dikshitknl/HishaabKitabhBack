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
import org.springframework.web.bind.annotation.RestController;

import com.cotiviti.HisabKitabh.models.SellDetails;
import com.cotiviti.HisabKitabh.service.SellDetailsService;

@RestController
@CrossOrigin()
public class SellDetailsController {

	@Autowired
	private SellDetailsService sellDetailService;

	@GetMapping("/sell-details/{id}")
	public ResponseEntity<Optional<SellDetails>> productDetailDetail(@PathVariable int id) {
		Optional<SellDetails> sellDetail = sellDetailService.findById(id);
		return new ResponseEntity<Optional<SellDetails>>(sellDetail, HttpStatus.OK);
	}

	@GetMapping("/sell-details")
	public ResponseEntity<List<SellDetails>> productDetailList() {
		List<SellDetails> sellDetails;
		sellDetails = sellDetailService.findAll();
		return new ResponseEntity<List<SellDetails>>(sellDetails, HttpStatus.OK);
	}

	@PostMapping("/sell-details")
	public ResponseEntity<SellDetails> productDetailcreate(@RequestBody SellDetails sellDetail) {
		SellDetails sellDetailTemp = sellDetailService.save(sellDetail);
		return new ResponseEntity<SellDetails>(sellDetailTemp, HttpStatus.OK);
	}

	@DeleteMapping("/sell-details/{id}")
	void productDetailDelete(@PathVariable int id) {
		sellDetailService.deleteById(id);
	}

}
