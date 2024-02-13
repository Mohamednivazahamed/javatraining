package com.tcs.oops;

public class createinvester {

	public static void main(String[] args) {
		Investor i1 = new Investor();
		
		i1.id =10;
		i1.name = "nivaz";
		i1.address = "pallivasal street";
		i1.amount =10000;
		System.out.println(i1);
		//System.out.println(i1.getClass().getName() + '@' + Integer.toHexString(i1.hashCode()));
	}
}
