package com.sri;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =45678 , sum =0;
		
//		while (num !=0) {
//			int digit = num %10;
//			sum+=digit;
//			num = num/10;
//		}
//		System.out.println(sum);
		int rev = 0;
		while (num >0) {
			int rem = num%10;
			rev = rev *10 + rem;
			num = num/10;
		}
		System.out.println(rev);
	}

}
