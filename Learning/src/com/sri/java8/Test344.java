package com.sri.java8;
class parent {
	parent(){
		show();
	}
	void show() {
		System.out.println("parent");
	}
}
public class Test344 extends parent {

	static int value =10;
	static int add(int value) {
		value+=10;
		return value;
	}
	
	int x = 20;
	Test344(){
		show();
	}
	void show() {
		System.out.print(x + " ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(6);
		System.out.println(add(value) + value);
        new Test344();
	}

}
