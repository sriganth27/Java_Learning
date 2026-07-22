package com.sri.stringprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringWithNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sri3 name4 test1 hllo2";
		String[] arr2 = str.split(" ");	
		String str2 = "sri3 name0 test1 hllo2";
		List<String> l1 = new ArrayList<>(Arrays.asList(str.split(" ")));

//		l1.sort((a, b) -> {
//			return Character.getNumericValue(a.charAt(a.length() - 1))
//					- Character.getNumericValue(b.charAt(b.length() - 1));
//		});
		
		Arrays.sort(arr2, (a,b)-> Character.compare(a.charAt(a.length()-1), b.charAt(b.length()-1)));

		for(String st : arr2) {
			System.out.print(st.substring(0,st.length()-1)+" ");
		}
		//l1.replaceAll( s -> s.replaceAll("\\d", ""));
//		for (int i = 0; i < l1.size(); i++) {
//			l1.set(i, l1.get(i).replaceAll("\\d", ""));
//		}
		//System.out.println(String.join(" ", l1));
		
		String[] arr = str2.split(" ");	
		String [] newArr = new String[arr.length];
		for(int i=0; i<arr.length;i++) {
			if(Character.isAlphabetic('9')) {
				
			}
			//System.out.println((arr[i].charAt(arr[i].length()-1)));
			//System.out.println(Integer.valueOf(arr[i].charAt(arr[i].length()-1)-'0'));
			int index = Integer.valueOf(arr[i].charAt(arr[i].length()-1) - '0');
			newArr[index] = arr[i].replaceAll("\\d", "");
		}
		System.out.println(Arrays.toString(newArr));
	}

}
