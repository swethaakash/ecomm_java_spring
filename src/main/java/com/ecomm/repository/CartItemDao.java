package com.ecomm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomm.models.CartItem;

public interface CartItemDao extends JpaRepository<CartItem, Integer>{

}
