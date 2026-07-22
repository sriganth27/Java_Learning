package dsa;

import java.util.Arrays;

public class LargestNumber17062026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {0,0,0};
		String [] strArray = new String[arr.length];
		for(int i=0 ; i<arr.length; i++) {
			strArray[i] = String.valueOf(arr[i]);
		}
		String result = findLargest(strArray);
		System.out.println(result);

	}

	private static String findLargest(String[] str) {
		// TODO Auto-generated method stub
		 Arrays.sort(str,(a,b)-> (b+a).compareTo(a+b));
	        StringBuilder sb = new StringBuilder();
	        if(str[0].equals("0")){
	            return "0";
	        }
	        for(String st : str){
	            sb.append(st);
	        }
		return sb.toString();
	}

}
