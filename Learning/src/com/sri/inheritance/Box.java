package com.sri.inheritance;

public class Box {
	double w;
	double l;
	double h;
	
	public Box() {
		
	}
	
	public Box(double w, double l, double h) {
		this.w = w;
		this.l = l;
		this.h = h;
	}

	@Override
	public String toString() {
		return "Box [w=" + w + ", l=" + l + ", h=" + h + "]";
	}

	public static void show() {
		System.out.println("i am in box class");
	}

}
