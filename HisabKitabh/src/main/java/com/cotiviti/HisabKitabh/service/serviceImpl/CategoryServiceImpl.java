package com.cotiviti.HisabKitabh.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotiviti.HisabKitabh.models.Category;
import com.cotiviti.HisabKitabh.repository.CategoryRepo;
import com.cotiviti.HisabKitabh.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepo categoryRepo;
	
    @Override
    public List<Category> findAll() {
	return categoryRepo.findAll();
    }

    @Override
    public Category save(Category category) {
	return categoryRepo.save(category);
    }

    @Override
    public void deleteById(Integer id) {
	categoryRepo.deleteById(id);
    }

	@Override
	public List<Category> findByNameIgnoreCase(String str1) {
		return categoryRepo.findByNameIgnoreCase(str1);
	}

	@Override
	public Optional<Category> findById(Integer id) {
		return categoryRepo.findById(id);
	}
}
