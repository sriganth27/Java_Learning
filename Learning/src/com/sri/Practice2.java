package com.sri;

import java.io.PrintStream;
import java.io.PrintWriter;

public class Practice2 {
	
	public static int compareString(String v1 , String v2) {
		String[] p1 = v1.split("\\.");
		String[] p2 = v2.split("\\.");
		
		int length = Math.max(p1.length, p2.length);
		
		for(int i=0; i<length;i++) {
			
			int l1 = i< p1.length ? Integer.parseInt(p1[i]) : 0;
			int l2 = i< p2.length ? Integer.parseInt(p2[i]) : 0;
			if(l1<l2) {
				return -1;
			}
			
			else if(l1 > l2) {
				return 1;
			}
		}
				
		return 0;
		
	}
	public static final PrintStream sriganth = null;
	public static void main(String[] t) {
		String v1 = "1.2.0";
		String v2 = "1.2";
		PrintWriter ps = new PrintWriter(System.out);
		ps.println("test");
		System.out.println(v1.compareTo(v2));
		System.out.println(v1.compareToIgnoreCase(v2));
		System.out.println(compareString(v1 ,v2));
	}

}
