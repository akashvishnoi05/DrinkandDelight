//package com.cg.project;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import com.cg.project.dao.CartDao;
//import com.cg.project.entities.Cart;
//import com.cg.project.service.CartService;
//
//@SpringBootTest  
//public class CartTest {
//	
//	@Autowired
//	private CartService cartService;
//	
//	@MockBean
//	private CartDao cartDao;
//	
//	@Test
//	public void save()
//	{
//		Cart cart=new Cart(22,35,null,null,6545);
//		int id=22;
//		when(cartDao.save(cart)).thenReturn(cart);
//		assertEquals(cart,cartService.save(cart));
//	}
//	
//	
//}
