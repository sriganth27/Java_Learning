package com.sri;

import java.util.Arrays;

public class NameSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Sriganth gnans   ffhh  kkkl";
		String [] arr = name.split("\\s+");

		String firstName = arr.length >= 1 ? arr[0]: "";
		String lastName = arr.length >=2 ? arr[arr.length -1]: "";
		//String middleName = arr.length > 2 ? arr[1] :"";
		String middleName = arr.length > 2 ? String.join(" ", Arrays.copyOfRange(arr, 1, arr.length-1)) : "";
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println("middle name :"+middleName);

	}

}
