package com.tcs.assignment2;

import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Investing {
	
	public static void main(String[] args) {
		//create few customers
		boolean validtrans;
		Configuration configure = new Configuration();
		configure = configure.configure();
		
		SessionFactory factory = configure.buildSessionFactory();
		System.out.println(factory);
		
		Session session=factory.openSession();
		System.out.println(session);
		
		Transaction transaction = session.beginTransaction();
		
		Investor i1= new Investor(01,"Mohamed",500,5000);
		Investor i2= new Investor(02,"Nivaz",700,7000);
		Investor i3= new Investor(03,"Ahamed",800,8000);
		Investor i4= new Investor(04,"Ravi",700,7000);
		Investor i5= new Investor(05,"Kumar",800,8000);
		
		
		session.save(i1);
		session.save(i2);
		session.save(i3);
		session.save(i4);
		session.save(i5);
	//	transaction.commit();
	//	transaction.commit();
		
		TransactionCache tc= new TransactionCache();
	//Task 1- insert 5 elements 	
		InvTransaction t1= new InvTransaction(01,45,01);
		if(t1.performTransaction(i1)) {
			session.saveOrUpdate(t1);
			session.saveOrUpdate(i1);
			tc.addTranslist(t1);
		}
		else {
			System.out.println("Invalid Transaction");
		}
		
		InvTransaction t2= new InvTransaction(02,100,01);
		if(t2.performTransaction(i1)) {
			session.save(t2);
			tc.addTranslist(t2);
		}
		else {
			System.out.println("Invalid Transaction");
		}
		InvTransaction t3= new InvTransaction(03,100,02);
		if(t3.performTransaction(i1)) {
			session.save(t3);
			tc.addTranslist(t3);
		}
		else {
			System.out.println("Invalid Transaction");
		}
		InvTransaction t4= new InvTransaction(04,45,01);
		if(t4.performTransaction(i1)) {
			session.save(t4);
			tc.addTranslist(t4);
		}
		else {
			System.out.println("Invalid Transaction");
		}
		InvTransaction t5= new InvTransaction(05,100,01);
		if(t5.performTransaction(i1)) {
			session.save(t5);
			tc.addTranslist(t5);
		}
		else {
			System.out.println("Invalid Transaction");
		}
		
		//update 5 elements in table 
		for(int i=1;i<=5;i++) {
			Investor inv = session.get(Investor.class, i);
			double updatedAmount =(inv.amountInvested)*10;
			inv.setAmountInvested(updatedAmount);
			
		}
		
	
	transaction.commit();
		

	
		//implementation of req 3
		ArrayList<InvTransaction> arr = tc.getTranslist();
		
		Iterator<InvTransaction> irr = arr.iterator();
		
		while(irr.hasNext()) {
			System.out.println(irr.next());
		}
		
		
//		System.out.println(i1);
//		System.out.println(i2);
//		System.out.println(i3);
		
		System.out.println("Printing data from database");
		for(int i=1;i<=5;i++) {
			Investor inv = session.get(Investor.class, i);
			System.out.println(inv);
		}
		
		System.out.println("transaction from database");
		for(int i=1;i<=5;i++) {
			InvTransaction inv2 = session.get(InvTransaction.class, i);
			System.out.println(inv2);
		}
		
	}
}
