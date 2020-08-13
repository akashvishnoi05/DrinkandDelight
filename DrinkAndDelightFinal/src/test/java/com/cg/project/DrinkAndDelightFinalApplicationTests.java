package com.cg.project;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.cg.project.controller.CartController;
import com.cg.project.dao.CartDao;
import com.cg.project.dao.CartDaoImpl;
import com.cg.project.entities.Cart;
import com.cg.project.entities.ProductEntity;
import com.cg.project.service.CartService;

@Transactional
@RunWith(MockitoJUnitRunner.class)
public class  DrinkAndDelightFinalApplicationTests
 {

	@Mock
	private CartDao dao;
	
	@Test
	public void testGetProduct()
	{
		
		when(dao.getProduct(1001)).thenReturn(null);
		assertEquals(null, dao.getProduct(1001));
	}

	@Test
	  public void testAddCart()
	{
		Cart cart = new Cart();
		when(dao.addCart(cart)).thenReturn(true);
		assertEquals(true,dao.addCart(cart));
	}
	
	@Test
	 public void testDeleteByProductId()
	{
		when(dao.deleteByProductId(1001)).thenReturn(true);
		assertEquals(true, dao.deleteByProductId(1001));
	}

}