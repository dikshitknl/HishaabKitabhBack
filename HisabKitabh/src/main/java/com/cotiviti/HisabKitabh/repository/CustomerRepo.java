package com.cotiviti.HisabKitabh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cotiviti.HisabKitabh.models.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

List<Customer> findByNameIgnoreCase(String str1);

}
