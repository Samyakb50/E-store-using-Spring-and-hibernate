package com.sam.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Helper {
	@Id
	@Column(name="oid")
	private int oid;
	
	@Column(name="cid")
	private int cid;
	
	public int getOid() {
		return oid;
	}
	
	public void setOid(int oid) {
		this.oid = oid;
	}
	
	public int getCid() {
		return cid;
	}
	
	public Helper(int oid, int cid) {
		super();
		this.oid = oid;
		this.cid = cid;
	}
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public Helper() {
		
	}
}
