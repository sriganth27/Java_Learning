package com.sri.interfaceDemo;

public abstract class Car implements Engine , MediaPlayer , Breake {
	

}

class Moderncar extends Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("moder car is strated");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("modern car is stoped");
		
	}
	
}
