package com.sri.stringprograms;

public class StringWithNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Hi i am 123 sriganth 678";
		StringBuilder sb = new StringBuilder();
		String [] arr = name.split(" ");
		int num =0;
		int number =0;
		for(String st : arr) {
			
			if(Character.isDigit(st.charAt(0))) {
				for(char ch : st.toCharArray()) {
//					num =  num + ch -'0';
					num =  num + Character.getNumericValue(ch);
				}
//				number = number + Integer.valueOf(st);
				number = number + Integer.valueOf(st);
			}
			else {
				sb.append(st).append(" ");
			}
		}
		
		System.out.println(sb.toString());
		System.out.println(num);
        System.out.println(number);
        
      
	}

}
