package com.cotiviti.HisabKitabh.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotiviti.HisabKitabh.models.ProductDetails;
import com.cotiviti.HisabKitabh.repository.ProductDetailRepo;
import com.cotiviti.HisabKitabh.service.ProductDetailService;

@Service
public class ProductDetailServiceImpl implements ProductDetailService {

	@Autowired
	private ProductDetailRepo productDetailsRepo;

	@Override
	public List<ProductDetails> findAll() {
		List<ProductDetails> prdAll = productDetailsRepo.findAll();
		for (ProductDetails prd: prdAll) {
			prd.setCategoryName(prd.getCategory().getName());
			prd.setBrandName(prd.getBrand().getName());
			prd.setVendorName(prd.getVendor().getName());
		}
		return productDetailsRepo.findAll();
	}

	@Override
	public ProductDetails save(ProductDetails productDetails) {
		return productDetailsRepo.save(productDetails);
	}

	@Override
	public void deleteById(Integer id) {
		productDetailsRepo.deleteById(id);
	}

	@Override
	public List<ProductDetails> findByNameIgnoreCase(String str1) {
		return productDetailsRepo.findByNameIgnoreCase(str1);
	}

	@Override
	public Optional<ProductDetails> findById(Integer id) {
		return productDetailsRepo.findById(id);
	}

}
