package com.cg.project.dao;

import com.cg.project.entities.Cart;
import com.cg.project.entities.ProductEntity;

public interface CartDao {

	public ProductEntity getProduct(int productId);

	public boolean addCart(Cart cart);

	public boolean deleteByProductId(int productId);

}
