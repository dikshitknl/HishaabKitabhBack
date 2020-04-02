package com.cotiviti.HisabKitabh.service;

import java.util.List;
import java.util.Optional;

import com.cotiviti.HisabKitabh.models.Vendor;

public interface VendorService {
	
	List<Vendor> findAll();
	
	Optional<Vendor> findById(Integer Id);
	
	Vendor save(Vendor vendor);
	
	void deleteById(Integer id);
	
	List<Vendor> findByNameIgnoreCase(String str1);
}
