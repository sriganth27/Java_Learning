package com.sri.inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box b1 = new Box(9,10,11);
		
		Box b2 = new BoxWeight(0, 0, 0,6); // upcasting
		
		BoxWeight b4 = (BoxWeight) b2;
		
		BoxWeight b3 = new BoxWeight(0,9,8,7);
		
		
		
		//BoxWeight b4 = new Box(3,4,5);
		
		System.out.println(b3.toString());
		System.out.println(b1.toString());
		System.out.println(b1 instanceof BoxWeight);
	}

}
