package com.tcs.ioc;

import org.springframework.beans.factory.annotation.Qualifier;

public class B {
	A a;
	@Qualifier("a1")
	
	public void setA(A a) {
		this.a = a;
	}
	public void other(){
		a.method();
	}
}