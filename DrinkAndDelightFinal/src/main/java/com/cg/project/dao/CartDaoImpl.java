package com.cg.project.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.cg.project.entities.Cart;
import com.cg.project.entities.ProductEntity;

@Repository
public class CartDaoImpl implements CartDao {

	@PersistenceContext
	EntityManager entityManager;
	

	/**************************************************************************
	 * This method is used to get Product by ProductId from the database.
	 * Method 	 : getProdct
	 * Type 	 : ProductEntity
	 * parameters: productId
	 * Author 	 : Akash Vishnoi
	 ***************************************************************************/
	
	@Override
	public ProductEntity getProduct(int productId) 
	{
		
		return entityManager.find(ProductEntity.class,productId);
	}
	
	/*****************************************************************************
	 * This method is used to add Product to the Cart by ProductId to the database.
	 * Method 	 : addCart
	 * Type 	 : boolean
	 * parameters: productId
	 * Author 	 : Akash Vishnoi
	 *****************************************************************************/
	
	@Override
	public boolean addCart(Cart cart)
	{

		entityManager.persist(cart);
		return true;
	}
	
	/***********************************************************************************
	 * This method is used to delete Product from the Cart by ProductId from the database.
	 * Method 	 : deleteProduct
	 * Type 	 : boolean
	 * parameters: productId
	 * Author 	 : Akash Vishnoi
	 ***********************************************************************************/
	
	@Override
	public boolean deleteByProductId(int productId) 
	{
		// TODO Auto-generated method stub
		Cart cart = entityManager.find(Cart.class, productId);
		entityManager.remove(cart);
		return true;
	}
	

}
