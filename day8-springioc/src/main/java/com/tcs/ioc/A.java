package com.tcs.ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class A {
	public void method() {
		System.out.println("Print from A");
	}
	@PostConstruct
	public void start() {
		System.out.println(getClass() + ".init()");
	}
	@PreDestroy
	public void terminate() {
		System.out.println(getClass() + ".destroy()");
	}
}