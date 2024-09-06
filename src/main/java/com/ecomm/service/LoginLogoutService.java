package com.ecomm.service;

import com.ecomm.models.CustomerDTO;
import com.ecomm.models.SellerDTO;
import com.ecomm.models.SessionDTO;
import com.ecomm.models.UserSession;


public interface LoginLogoutService {
	
	public UserSession loginCustomer(CustomerDTO customer);
	
	public SessionDTO logoutCustomer(SessionDTO session);
	
	public void checkTokenStatus(String token);
	
	public void deleteExpiredTokens();
	
	
	public UserSession loginSeller(SellerDTO seller);
	
	public SessionDTO logoutSeller(SessionDTO session);
	
	
}
