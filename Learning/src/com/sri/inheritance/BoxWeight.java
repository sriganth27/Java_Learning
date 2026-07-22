package com.sri.inheritance;

public class BoxWeight extends Box{
	double weight;

	public BoxWeight() {
		
		this.weight = -1;
	}
	public BoxWeight(double w, double l, double h , double weight) {
		super(w, l, h);
		this.weight = weight;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BoxWeight [weight=" + weight +  " w= " + w + ", l=" + l + ", h=" + h + "]";
	}
	
	
	public static void show() {
		
	}

}
