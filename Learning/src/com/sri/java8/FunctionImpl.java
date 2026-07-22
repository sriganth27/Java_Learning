package com.sri.java8;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.*;
public class FunctionImpl implements Function<String,Integer>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String,Integer> f = new FunctionImpl();
		System.out.println(f.apply("sriganth"));
		
		// takes input return value
		Function<String,Integer> f2 = (s) -> s.length();
		System.out.println(f2.apply("sri"));
		
		// takes input return nothing
		Consumer<String> c1 = (e) -> System.out.println(e);
		c1.accept("tetsing");
		
		// no input return value
		Supplier<LocalDateTime> sp = () -> LocalDateTime.now();
		System.out.println(sp.get());
		
		// takes input retunr boolean
		Predicate<Integer> p = (s) -> s%2 ==0;
		System.out.println(p.test(4));

	}

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return t.length();
	}

}
