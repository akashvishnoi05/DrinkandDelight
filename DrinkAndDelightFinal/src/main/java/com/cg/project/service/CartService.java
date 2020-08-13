package com.cg.project.service;

import com.cg.project.entities.Cart;

public interface CartService 
{
	
	public boolean addCart(int productId);
	
	public boolean deleteByProductId(int productId);


}
