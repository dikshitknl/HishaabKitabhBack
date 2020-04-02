package com.cotiviti.HisabKitabh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cotiviti.HisabKitabh.models.Brand;

public interface BrandRepo extends JpaRepository<Brand, Integer> {

	List<Brand> findByNameIgnoreCase(String str1);

}
