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

import com.cotiviti.HisabKitabh.models.Category;
import com.cotiviti.HisabKitabh.service.CategoryService;

@RestController
@CrossOrigin()
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/categorys/{id}")
	public ResponseEntity<Optional<Category>> categoryDetail(@PathVariable int id) {
		Optional<Category> category = categoryService.findById(id);
		return new ResponseEntity<Optional<Category>>(category, HttpStatus.OK);
	}

	@GetMapping("/categorys")
	public ResponseEntity<List<Category>> categoryList(@RequestParam(required = false) String q) {
		List<Category> categorys;
		if (q == null) {
			categorys = categoryService.findAll();
		} else {
			categorys = categoryService.findByNameIgnoreCase(q);
		}
		return new ResponseEntity<List<Category>>(categorys, HttpStatus.OK);
	}

	@PostMapping("/categorys")
	public ResponseEntity<Category> categorycreate(@RequestBody Category category) {
		Category categoryTemp = categoryService.save(category);
		return new ResponseEntity<Category>(categoryTemp, HttpStatus.OK);
	}

	@DeleteMapping("/categorys/{id}")
	void categoryDelete(@PathVariable int id) {
		categoryService.deleteById(id);
	}

}
