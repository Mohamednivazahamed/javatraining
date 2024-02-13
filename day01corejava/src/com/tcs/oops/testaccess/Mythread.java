package com.tcs.oops.testaccess;

public class Mythread extends Thread {
String name;

public Mythread(String name) {
	super();
	this.name = name;
}

@Override
	public void run() {
		// TODO Auto-generated method stub
	for(int i=1;i<=5;i++) {
		System.out.println(name + "is executing @ "+i);
		
	}
		super.run();
	}

}
