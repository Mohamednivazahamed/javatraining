package com.tcs.ioc;

public class Circle {
	Radius r; 

	void calculateArea(int value) {
		float area;
		r.setR(value);
		float radius=r.getR();
		area = 2*3.14f*radius;
		System.out.println("area is "+ area);
	}

	

	public void setR(Radius r) {
		this.r = r;
	}
	

}
