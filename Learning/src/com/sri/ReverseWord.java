package com.sri;

import java.util.Stack;
import java.util.StringJoiner;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hi ,i am sriganth";
		//method 1
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println("reverse " +sb.reverse());
		
		//method 2
		String[] word = str.split(" ");
		
		Stack<String> st = new Stack<>();
		for(String words : word) {
			st.push(words);
		}
	
		//System.out.println(st);
		StringJoiner sg = new StringJoiner("," , "{" , "}");
		//StringBuilder sg = new StringBuilder(" ");
		
		while(!st.isEmpty()) {
			//sg.append(st.pop() + " ");
			sg.add(st.pop());
		}

		System.out.println(sg.toString());
		
		//method 3
		
		String rev = "";
		
		for(String w: word) {
			StringBuffer sb2 = new StringBuffer(w);
			sb2.reverse();
			
			rev = rev + sb2 + " ";
			
		}
		System.out.println(rev);
	}

}
