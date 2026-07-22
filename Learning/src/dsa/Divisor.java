package dsa;

import java.util.ArrayList;
import java.util.List;

public class Divisor {
	public static void main(String[] args) {
		int a = 36;
		List<Integer> ls = new ArrayList<>();
		List<Integer> ls2 = new ArrayList<>();
		// Method 1
		for(int i = 1 ; i<=a ; i++) {
			if( a % i ==0) {
				ls.add(i);
			}
		}
		
		
		System.out.println(ls);
		
		int b = 36;
		// Mthod 2 
		for(int i=1 ; i * i <= a ; i++) {
			if(b%i == 0) {
				ls2.add(i);
				if(i!= b/i) {
					ls2.add(b/i);
				}
				
			}
		}
		System.out.println(ls2);
	}
}
