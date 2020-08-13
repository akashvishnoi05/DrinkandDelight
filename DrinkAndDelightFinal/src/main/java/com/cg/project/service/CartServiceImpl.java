package com.cg.project.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.project.dao.CartDao;
import com.cg.project.entities.Cart;
import com.cg.project.entities.ProductEntity;


@Transactional
@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartDao cartDao;
	
	/*****************************************************************************
	 * This method is used to add Product to the Cart by ProductId to the database.
	 * Method 	 : addCart
	 * Type 	 : boolean
	 * parameters: productId
	 * Author 	 : Akash Vishnoi
	 *****************************************************************************/
	
	@Override
	public boolean addCart(int productId)
	{
		ProductEntity product=cartDao.getProduct(productId);
		Cart cart=new Cart();
		cart.setProduct(product);
		cart.setTotalAmount(150);
		cartDao.addCart(cart);
		return cartDao.addCart(cart);
	}
	
	/***********************************************************************************
	 * This method is used to delete Product from the Cart by ProductId from the database.
	 * Method 	 : deleteProduct
	 * Type 	 : boolean
	 * parameters: productId
	 * Author 	 : Akash Vishnoi
	 ***********************************************************************************/
	
	@Override
	public boolean deleteByProductId(int ProductId)
	{
		return cartDao.deleteByProductId(ProductId);
	}
	


}

