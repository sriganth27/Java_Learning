package com.sri.singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SingletonClass s1 = new SingletonClass();
		SingletonClass s1 = SingletonClass.getInstance();
		SingletonClass s2 = SingletonClass.getInstance();
		SingletonClass s3 = SingletonClass.getInstance();

	}

}
