package com.tcs.oops.encapsulation;

public class createinvester {

	public static void main(String[] args) {
		Investor i1 = new Investor();
		
		i1.setId(0);
		i1.setAddress("hello");
		i1.setAmount(0);
		i1.setName("hello");
	     System.out.println(i1.getCount());
		Investor i2 = new Investor(0,"hello","hello",0);
		//System.out.println(i1);
		//System.out.println(i1.getClass().getName() + '@' + Integer.toHexString(i1.hashCode()));
		 System.out.println(i2.getCount());
		 Investor i3 = new Investor(0,"hello","hello",0);
		 Investor i4 = new Investor(0,"hello","hello",0);
		 System.out.println(i4.getCount());
		 
		 System.out.println(i1.getCount());
//		if (i1.equals(i2)) {
//			//System.out.println("Success");
//		}
//		else {
//			System.out.println(i1.hashCode());
//			System.out.println(i2.hashCode());
//			System.out.println("failure");
//		}
	}
}
