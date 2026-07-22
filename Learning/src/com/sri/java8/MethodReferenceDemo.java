package com.sri.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceDemo {

	static int add(int a , int b) {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// 1. static method reference
		Function<Integer, Double> fun = (e) -> Math.sqrt(e);
		System.out.println(fun.apply(6));
		
		Function<Integer, Double> fun2 = Math::sqrt;
		System.out.println(fun2.apply(6));
		
		BiFunction<Integer, Integer, Integer> bf = (a,b) -> MethodReferenceDemo.add(a, b);
		System.out.println(bf.apply(4, 6));
		
		BiFunction<Integer, Integer, Integer> bf2 =  MethodReferenceDemo::add;
		System.out.println(bf2.apply(43, 6));
		
		
		//3.instance method reference of arbitary object
		
		Consumer<String> cm = (s) -> System.out.println(s);
		cm.accept("sriganth");
		
		Function<String , String> cm2 = String::toUpperCase;
		System.out.println(cm2.apply("sriganth"));
		
		String [] arr = {"e","r","t","y","i","a"};
		Arrays.sort(arr, (a,b) -> a.compareTo(b));
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, String::compareTo);
		
		System.out.println(Arrays.toString(arr));
		
		//4.constructor reference
		
		List<String> ls = new ArrayList<>();
		ls.add("name");
		ls.add("name");
		ls.add("age");
		
		Function<List<String>, Set<String>> fn = (e) -> new HashSet<>(e);
		
		System.out.println(fn.apply(ls));
		
		Function<List<String>, Set<String>> fn2 = HashSet::new;
		
		System.out.println(fn2.apply(ls));
		
		
	}

}
