package com.tcs.staticdemo;

public class StaticDemo {
static {
	System.out.println("I'm a static block");
}
{
	System.out.println("I'm a anonymous  block");
}
static void Operation() {
	System.out.println("I'm a Operation");
}
}
