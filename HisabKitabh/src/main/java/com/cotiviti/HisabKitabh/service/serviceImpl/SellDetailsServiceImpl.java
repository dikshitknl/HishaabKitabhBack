package com.cotiviti.HisabKitabh.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotiviti.HisabKitabh.models.ProductDetails;
import com.cotiviti.HisabKitabh.models.SellDetails;
import com.cotiviti.HisabKitabh.repository.SellDetailRepo;
import com.cotiviti.HisabKitabh.service.SellDetailsService;

@Service
public class SellDetailsServiceImpl implements SellDetailsService {

	@Autowired
	private SellDetailRepo sellDetailRepo;

	@Override
	public List<SellDetails> findAll() {
		List<SellDetails> sellAll = sellDetailRepo.findAll();
		for (SellDetails sell : sellAll) {
			ProductDetails prd = sell.getProduct();
			sell.setBrand(prd.getBrand().getName());
			sell.setProductName(prd.getName());
			sell.setUnit(prd.getUnit());
			sell.setRate(prd.getSellRate());
			sell.setTotal(sell.getRate() * sell.getQty());
		}
		return sellDetailRepo.findAll();
	}

	@Override
	public SellDetails save(SellDetails sellDetails) {
		return sellDetailRepo.save(sellDetails);
	}

	@Override
	public void deleteById(Integer id) {
		sellDetailRepo.deleteById(id);
	}

	@Override
	public Optional<SellDetails> findById(Integer id) {
		return sellDetailRepo.findById(id);
	}

}
