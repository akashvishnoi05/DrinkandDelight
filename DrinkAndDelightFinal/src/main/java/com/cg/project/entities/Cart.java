package com.cg.project.entities;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "cart_table")
@DynamicInsert

public class Cart 
{ 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cart_id")
	private int cartId;
	

	@ManyToOne(targetEntity = ProductEntity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id",referencedColumnName="product_id")
	private ProductEntity product;
	
	@Column(name = "total_amount" )
	private double totalAmount;

	public Cart()
	{
		super();
	}

	public Cart(int cartId, int orderId, ProductEntity product, double totalAmount) {
		super();
		this.cartId = cartId;
		this.product = product;
		this.totalAmount = totalAmount;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}


	public ProductEntity getProduct() {
		return product;
	}

	
	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", product=" + product + ", totalAmount=" + totalAmount + "]";
	}
	
	
}