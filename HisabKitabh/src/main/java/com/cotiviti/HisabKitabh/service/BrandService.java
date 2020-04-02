package com.cotiviti.HisabKitabh.service;

import java.util.List;
import java.util.Optional;

import com.cotiviti.HisabKitabh.models.Brand;

public interface BrandService {

	List<Brand> findAll();

	Optional<Brand> findById(Integer id);

	Brand save(Brand brand);

	void deleteById(Integer id);
	
	List<Brand> findByNameIgnoreCase(String str1);
}
