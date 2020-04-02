package com.cotiviti.HisabKitabh.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotiviti.HisabKitabh.models.Brand;
import com.cotiviti.HisabKitabh.repository.BrandRepo;
import com.cotiviti.HisabKitabh.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {
	
	@Autowired
    private BrandRepo brandRepo;

    @Override
    public List<Brand> findAll() {
	return brandRepo.findAll();
    }

    @Override
    public Brand save(Brand brand) {
	return brandRepo.save(brand);
    }

    @Override
    public void deleteById(Integer id) {
	brandRepo.deleteById(id);
    }

	@Override
	public List<Brand> findByNameIgnoreCase(String str1) {
		return brandRepo.findByNameIgnoreCase(str1);
	}

	@Override
	public Optional<Brand> findById(Integer id) {
		return brandRepo.findById(id);
	}
    
}
