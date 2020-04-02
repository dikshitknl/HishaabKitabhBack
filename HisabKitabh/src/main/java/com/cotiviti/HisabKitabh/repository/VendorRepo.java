package com.cotiviti.HisabKitabh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cotiviti.HisabKitabh.models.Vendor;

public interface VendorRepo extends JpaRepository<Vendor, Integer> {
	
	List<Vendor> findByNameIgnoreCase(String str1);

}
