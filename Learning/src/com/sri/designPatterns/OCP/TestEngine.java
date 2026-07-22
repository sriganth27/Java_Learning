package com.sri.designPatterns.OCP;

class Engine {
	public void start() {
		System.out.println("engine is start");
	}
}

class car {
	Engine eng = new Engine();
	
    public void drive() {
    	eng.start();
    	System.out.println("car is drive");
    }
	
}
public class TestEngine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      car obj = new car();
      obj.drive();
	}

}
