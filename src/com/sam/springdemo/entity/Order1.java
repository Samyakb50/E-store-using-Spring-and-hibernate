package com.sam.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order1 {
	@Id
	@Column(name="orderId")
	private int orderId;
	
	@Column(name="date")
	private String date;
	
	@Column(name="status")
	private String status;
	
	@Column(name="total")
	private int total;
	
	public int getOrderId() {
		return orderId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public Order1(int orderId, String date, String status, int total) {
		super();
		this.orderId = orderId;
		this.date = date;
		this.status = status;
		this.total = total;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Order1() {
		
	}
}
