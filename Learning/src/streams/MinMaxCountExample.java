package streams;

import java.util.Arrays;
import java.util.List;

public class MinMaxCountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Terminal Operation
		List<Integer> ls = Arrays.asList(2,4,1,2,5);
		
		//1.Min example
		int res = ls.stream().min(Integer::compareTo).get();
		System.out.println(res);
		
		//2.Max example
		
		int max = ls.stream().max(Integer::compareTo).get();
		System.out.println(max);
		
		//3.count example
		long count = ls.stream().count();
		System.out.println(count);

	}

}
