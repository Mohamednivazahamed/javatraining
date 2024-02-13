package com.tcs.oops;

public class Investor {
   int id; 
   String name;
   String address;
   int amount;
  
   @Override
public String toString() {
	return "Investor [id=" + id + ", name=" + name + ", address=" + address + ", amount=" + amount + "]";
}
}
