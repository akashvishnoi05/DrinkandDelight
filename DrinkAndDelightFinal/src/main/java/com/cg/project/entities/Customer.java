package com.cg.project.entities;

import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name="customer_table")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="userId")

public class Customer extends User {
	

	public Customer(String username, String password) {
		super(username, password);
	}
	
	
	
	@Column(name="customer_name")
	private String customerName;
	
	@Column(name="email",unique=true,nullable=false)
	private String email;
	
	@Column(name="contact")
	private String contact;
	
	public Customer() {
		
	}


	public String getCustomer_name() {
		return customerName;
	}

	public void setCustomer_name(String customer_name) {
		this.customerName = customer_name;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		//super.setUsername(email);
		this.email = email;
	}

	@JsonIgnore
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
}
