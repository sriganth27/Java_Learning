package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//use for debugging while processing the elements
		List<Integer> ls = Arrays.asList(1,2,3,45,6);
		
		
		List<Integer> res = ls.stream()
				.peek(System.out::println)
				.filter(n-> n%2==0)
				.collect(Collectors.toList());
		
		System.out.println(res);
	}

}
