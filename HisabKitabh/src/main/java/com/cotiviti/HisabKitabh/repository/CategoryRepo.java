package com.cotiviti.HisabKitabh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cotiviti.HisabKitabh.models.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

	List<Category> findByNameIgnoreCase(String str1);
}
