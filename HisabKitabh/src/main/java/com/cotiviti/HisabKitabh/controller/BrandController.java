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

import com.cotiviti.HisabKitabh.models.Brand;
import com.cotiviti.HisabKitabh.service.BrandService;

@RestController
@CrossOrigin()
public class BrandController {

	@Autowired
	private BrandService brandService;

	@GetMapping("/brands/{id}")
	public ResponseEntity<Optional<Brand>> brandDetail(@PathVariable int id) {
		Optional<Brand> brand = brandService.findById(id);
		return new ResponseEntity<Optional<Brand>>(brand, HttpStatus.OK);
	}

	@GetMapping("/brands")
	public ResponseEntity<List<Brand>> brandList(@RequestParam(required = false) String q) {
		List<Brand> brands;
		if (q == null) {
			brands = brandService.findAll();
		} else {
			brands = brandService.findByNameIgnoreCase(q);
		}
		return new ResponseEntity<List<Brand>>(brands, HttpStatus.OK);
	}

	@PostMapping("/brands")
	public ResponseEntity<Brand> brandcreate(@RequestBody Brand brand) {
		Brand brandTemp = brandService.save(brand);
		return new ResponseEntity<Brand>(brandTemp, HttpStatus.OK);
	}

	@DeleteMapping("/brands/{id}")
	void brandDelete(@PathVariable int id) {
		brandService.deleteById(id);
	}

}
