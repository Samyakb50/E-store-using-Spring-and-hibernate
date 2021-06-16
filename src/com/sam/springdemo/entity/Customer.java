package com.sam.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
	 	@Column(name="customerId")
	    private int customerId;
	 
		@Column(name="customerName")
	    private String customerName;
	    
	    @Column(name="customerEmail")
	    private String customerEmail;
	    
	    @Column(name="customerPhone")
	    private String customerPhone;
	    
	    @Column(name="address")
	    private String address;
	    
	    @Column(name="password")
	    private String password;
	    
	    @Column(name="username")
	    private String username;
	    
	    public int getCustomerId() {
	        return customerId;
	    }

	    public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public void setCustomerId(int customerId) {
	        this.customerId = customerId;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public void setCustomerName(String customerName) {
	        this.customerName = customerName;
	    }

	    public String getCustomerEmail() {
	        return customerEmail;
	    }

	    public void setCustomerEmail(String customerEmail) {
	        this.customerEmail = customerEmail;
	    }

	    public String getCustomerPhone() {
	        return customerPhone;
	    }

	    public void setCustomerPhone(String customerPhone) {
	        this.customerPhone = customerPhone;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

//	    public BillingAddress getBillingAddress() {
//	        return billingAddress;
//	    }
//
//	    public void setBillingAddress(BillingAddress billingAddress) {
//	        this.billingAddress = billingAddress;
//	    }
//
//	    public ShippingAddress getShippingAddress() {
//	        return shippingAddress;
//	    }
//
//	    public void setShippingAddress(ShippingAddress shippingAddress) {
//	        this.shippingAddress = shippingAddress;
//	    }
//
//	    public Cart getCart() {
//	        return cart;
//	    }
//
//	    public void setCart(Cart cart) {
//	        this.cart = cart;
//	    }
}
