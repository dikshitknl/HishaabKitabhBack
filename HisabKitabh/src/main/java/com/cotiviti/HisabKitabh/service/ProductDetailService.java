package com.cotiviti.HisabKitabh.service;

import java.util.List;
import java.util.Optional;

import com.cotiviti.HisabKitabh.models.ProductDetails;

public interface ProductDetailService {


	List<ProductDetails> findAll();
	
	Optional<ProductDetails> findById(Integer id);

	ProductDetails save(ProductDetails productDetails);

	void deleteById(Integer id);

	List<ProductDetails> findByNameIgnoreCase(String str1);
}
