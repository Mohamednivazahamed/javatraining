package com.tcs.assignment1;

import java.util.ArrayList;
import java.util.Iterator;

public class Investing {
	
	public static void main(String[] args) {
		//create few customers
		
		InvestorClass i1= new InvestorClass(01,"Mohamed",500,5000);
		InvestorClass i2= new InvestorClass(02,"Nivaz",700,7000);
		InvestorClass i3= new InvestorClass(03,"Ahamed",800,8000);
		
		TransactionCache tc= new TransactionCache();
		
		Transaction t1= new Transaction(01,45,01);
		t1.performTransaction(i1);
		Transaction t2= new Transaction(02,100,01);
		t2.performTransaction(i1);
		Transaction t3= new Transaction(03,100,02);
		t3.performTransaction(i2);
		
		tc.addTranslist(t1);
		tc.addTranslist(t2);
		tc.addTranslist(t3);
		
		ArrayList<Transaction> arr = tc.getTranslist();
		
		Iterator<Transaction> irr = arr.iterator();
		
		while(irr.hasNext()) {
			System.out.println(irr.next());
		}
		
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
	}
}
