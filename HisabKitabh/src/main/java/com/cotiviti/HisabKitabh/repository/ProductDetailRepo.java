package com.cotiviti.HisabKitabh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cotiviti.HisabKitabh.models.ProductDetails;

public interface ProductDetailRepo extends JpaRepository<ProductDetails, Integer> {

	List<ProductDetails> findByNameIgnoreCase(String str1);

}
