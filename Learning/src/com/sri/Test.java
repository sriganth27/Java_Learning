package com.sri;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.StringJoiner;

public class Test {
	
	
	void m1()throws NullPointerException {
		throw new NullPointerException();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Test t = new Test();
        //  t.m1();

//          try {
//        	  t.m1();
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
         
       //Step 1:
       String name = "Hi I am Sriganth";
       String rev = "";
       StringBuffer sb = new StringBuffer(name);
       System.out.println(sb.reverse());
       //Step 2:
       for(int i = name.length()-1  ; i >= 0 ; i--) {
    	   char ch = name.charAt(i);
    	  // System.out.println(ch);
    	   rev=rev+ch;
       }
       
       System.out.println(rev);
       //Step 3:
       String[] word = name.split(" "); 
       Collections.reverse(Arrays.asList(word));
       String revWord = String.join(" ", word);
       
       System.out.println(" test " + revWord);
       System.out.println("using Collection " + Arrays.toString(word));
       Stack<String> st = new Stack<>();
       for(String str : word) {
    	   st.push(str);
       }
       System.out.println(st);
       StringJoiner sj = new StringJoiner(" ");
       while(!st.isEmpty()) {
    	   sj.add(st.pop());
       }
       System.out.println(sj.toString());
       
       String str3 = "";
       //step 4:
       for ( String str2 : word) {
    	   StringBuffer sb2 = new StringBuffer(str2);
    	   str3+=sb2.reverse() + " ";
       }
       
       System.out.println(str3);
	}

}
