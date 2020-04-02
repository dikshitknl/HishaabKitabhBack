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

import com.cotiviti.HisabKitabh.models.ProductDetails;
import com.cotiviti.HisabKitabh.service.ProductDetailService;

@RestController
@CrossOrigin()
public class ProductDetailsController {

	@Autowired
	private ProductDetailService productDetailService;
	
	@GetMapping("/product-details/{id}")
	public ResponseEntity<Optional<ProductDetails>> productDetailDetail(@PathVariable int id) {
		Optional<ProductDetails> productDetail = productDetailService.findById(id);
		return new ResponseEntity<Optional<ProductDetails>>(productDetail, HttpStatus.OK);
	}

	@GetMapping("/product-details")
	public ResponseEntity<List<ProductDetails>> productDetailList(@RequestParam(required = false) String q) {
		List<ProductDetails> productDetails;
		if (q == null) {
			productDetails = productDetailService.findAll();
		} else {
			productDetails = productDetailService.findByNameIgnoreCase(q);
		}
		return new ResponseEntity<List<ProductDetails>>(productDetails, HttpStatus.OK);
	}

	@PostMapping("/product-details")
	public ResponseEntity<ProductDetails> productDetailcreate(@RequestBody ProductDetails productDetail) {
		ProductDetails productDetailTemp = productDetailService.save(productDetail);
		return new ResponseEntity<ProductDetails>(productDetailTemp, HttpStatus.OK);
	}

	@DeleteMapping("/product-details/{id}")
	void productDetailDelete(@PathVariable int id) {
		productDetailService.deleteById(id);
	}

	
}
