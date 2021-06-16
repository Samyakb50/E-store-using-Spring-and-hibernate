package com.sam.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {
		@Id
		@Column(name="productId")
		private int productId;

		@Column(name="productPrice")
		private int productPrice;
	
		@Column(name="quantity")
		private int quantity;
 	
		@Column(name="customerId")
	    private int customerId;
	 	
	    @Column(name="orderId")
	    private int orderId;
	    
	    public Cart(int productId, int productPrice, int quantity, int customerId, int orderId) {
	    	super();
	    	this.productId = productId;
	    	this.productPrice = productPrice;
			this.quantity = quantity;
			this.customerId = customerId;
			this.orderId = orderId;
	    }
	
		public int getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(int productPrice) {
			this.productPrice = productPrice;
		}

		public int getProductId() {
			return productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}
	
		public int getQuantity() {
			return quantity;
		}
	
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
	
		public int getCustomerId() {
			return customerId;
		}
	
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
	
		public int getOrderId() {
			return orderId;
		}
	
		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}
		public Cart() {
			
		}
}
