package dsa;

import java.util.Arrays;

public class CountDigits {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123456;
		int num = 90800;
		
		// Method 1
		String a = String.valueOf(number);
		String [] arr = a.split("");
		System.out.println(Arrays.toString(arr));
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			count++;
		}

		System.out.println(count);
		
		// Method 2
		int cunt = (int) (Math.log10(number)+1);
		System.out.println(cunt);
		
		//Method 3
		int cnt = 0;
		while(number!=0 ) {
			cnt++;
			number = number /10;
		}
		System.out.println(cnt);
		
		// Mthod 4
		
		String value = String.valueOf(num);
		System.out.println(value);
		System.out.println(value.length());
	}

}
