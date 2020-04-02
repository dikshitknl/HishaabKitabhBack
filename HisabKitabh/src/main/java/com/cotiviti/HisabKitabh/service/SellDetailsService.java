package com.cotiviti.HisabKitabh.service;

import java.util.List;
import java.util.Optional;

import com.cotiviti.HisabKitabh.models.SellDetails;

public interface SellDetailsService {

	List<SellDetails> findAll();

	Optional<SellDetails> findById(Integer id);

	SellDetails save(SellDetails sellDetails);

	void deleteById(Integer id);

}
