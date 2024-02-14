package com.tcs.restclient;

import org.springframework.context.annotation.Import;

public class Product {

	private int pID;
	private String description;
	private double p_amount;
	public int getpID() {
		return pID;
	}
	public void setpID(int pID) {
		this.pID = pID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getP_amount() {
		return p_amount;
	}
	public void setP_amount(double p_amount) {
		this.p_amount = p_amount;
	}
	
	
	

}
