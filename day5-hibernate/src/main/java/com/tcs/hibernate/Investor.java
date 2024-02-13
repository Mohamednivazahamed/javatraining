package com.tcs.hibernate;

import java.util.Objects;

import javax.annotation.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 

@javax.persistence.Entity
public class Investor {
	
  @javax.persistence.Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id; 
  private String name;
  private String address;
  private double amount;
 

public Investor() {
	
}


public Investor(int id, String name, String address, int amount) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.amount = amount;
	
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}




public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}

@Override
public String toString() {
	return "Investor [id=" + id + ", name=" + name + ", address=" + address + ", amount=" + amount + "]";
}



}
