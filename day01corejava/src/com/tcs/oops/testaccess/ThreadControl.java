package com.tcs.oops.testaccess;

public class ThreadControl {
public static void main(String[] args) {
	System.out.println("Before");
	Mythread m1 = new Mythread("T1");
	//m1.setDaemon(true);
	m1.start();
	Mythread m2 = new Mythread("T2");
	//m2.setDaemon(true);
	m2.start();
	try {
		m2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("After");
	
	
}
}
