package com.cg.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.project.dao.CartDao;
import com.cg.project.entities.ProductEntity;
import com.cg.project.exception.IdNotFoundException;
import com.cg.project.service.CartService;


@RestController
public class CartController
{
	
	
	@Autowired
	CartService cartService;
	
	@Autowired
	CartDao cartDao;

	/******************************************************************
	    *Method               -  addCart
	    *Description          -  To get the added product in cart by Id
	    *parameter            -  productId
	    *Created By           -  Akash Vishnoi                           
	*******************************************************************/
	
	@GetMapping("/addCart/{productid}")
    public String addCart(@PathVariable("productid")int productId)
    {
		ProductEntity product = new ProductEntity();
		 product=cartDao.getProduct(productId);
		 
	 if (productId == 0 )
			throw new IdNotFoundException("product ID not found.");

	if( product == null) 
		throw new IdNotFoundException("product ID not found.");
	 
		 cartService.addCart(productId);
    	 return ("product Added to Cart");
    	   
    }
 
	/************************************************************
	    *Method               -  deleteCartProduct
	    *Description          -  To delete product from cart by Id
	    *parameter            -  productId
	    *Created By           -  Akash Vishnoi                           
	*************************************************************/
	
 @DeleteMapping("/deleteCart/{productId}")
    public String deleteCart(@PathVariable int productId)
   {
	 if (productId == 0)
			throw new IdNotFoundException("product ID not found.");
	 
	 
		 cartService.deleteByProductId(productId);
		 return "Deleted Product - "+productId;
	//This functionality is working(showing deleted(product id) but data is not deleted from the database
   }
 
 }


	

