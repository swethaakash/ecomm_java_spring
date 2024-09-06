package com.ecomm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomm.models.Seller;

public interface SellerDao extends JpaRepository<Seller, Integer> {
	
	Optional<Seller> findByMobile(String mobile);
	
}
