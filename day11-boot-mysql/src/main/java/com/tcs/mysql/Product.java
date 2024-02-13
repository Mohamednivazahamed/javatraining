package com.tcs.mysql;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Product {
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String description;
	private double pAmount;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String description, double pAmount) {
		super();
		this.pid = pid;
		this.description = description;
		this.pAmount = pAmount;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getpAmount() {
		return pAmount;
	}

	public void setpAmount(double pAmount) {
		this.pAmount = pAmount;
	}
	
	
}
