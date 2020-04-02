package com.cotiviti.HisabKitabh.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotiviti.HisabKitabh.models.Vendor;
import com.cotiviti.HisabKitabh.repository.VendorRepo;
import com.cotiviti.HisabKitabh.service.VendorService;

@Service
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	private VendorRepo vendorRepo;
	
	@Override
    public List<Vendor> findAll() {
	return vendorRepo.findAll();
    }

    @Override
    public Vendor save(Vendor vendor) {
	return vendorRepo.save(vendor);
    }

    @Override
    public void deleteById(Integer id) {
	vendorRepo.deleteById(id);
    }

	@Override
	public List<Vendor> findByNameIgnoreCase(String str1) {
		return vendorRepo.findByNameIgnoreCase(str1);
	}

	@Override
	public Optional<Vendor> findById(Integer id) {
		return vendorRepo.findById(id);
	}
	
	

	
}
