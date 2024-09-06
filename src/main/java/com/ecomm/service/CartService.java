package com.ecomm.service;

import java.util.List;

import com.ecomm.controller.ProductNotFound;
import com.ecomm.exception.CartItemNotFound;
import com.ecomm.models.Cart;
import com.ecomm.models.CartDTO;
import com.ecomm.models.CartItem;




public interface CartService {
	
	public Cart addProductToCart(CartDTO cart, String token) throws CartItemNotFound;
	public Cart getCartProduct(String token);
	public Cart removeProductFromCart(CartDTO cartDto,String token) throws ProductNotFound;
//	public Cart changeQuantity(Product product,Customer customer,Integer quantity);
	
	public Cart clearCart(String token);
	
}
