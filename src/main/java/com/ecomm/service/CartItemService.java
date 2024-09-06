package com.ecomm.service;

import com.ecomm.models.CartDTO;
import com.ecomm.models.CartItem;

public interface CartItemService {
	
	public CartItem createItemforCart(CartDTO cartdto);
	
}
