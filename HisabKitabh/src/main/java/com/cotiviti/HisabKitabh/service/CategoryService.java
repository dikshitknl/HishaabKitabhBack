package com.cotiviti.HisabKitabh.service;

import java.util.List;
import java.util.Optional;

import com.cotiviti.HisabKitabh.models.Category;

public interface CategoryService {

	List<Category> findAll();
	
	Optional<Category> findById(Integer id);

	Category save(Category category);

	void deleteById(Integer id);

	List<Category> findByNameIgnoreCase(String str1);

}
