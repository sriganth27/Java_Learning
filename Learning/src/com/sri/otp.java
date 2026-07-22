package com.sri;

import java.util.Random;

public class otp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String otp = "";
		Random rm = new Random();
		
		System.out.println(rm.nextInt(10));
		for(int i = 0 ; i<6 ; i++) {
			otp = otp + rm.nextInt(10);
		}
		
		System.out.println("the OTP is "+otp);

	}

}
