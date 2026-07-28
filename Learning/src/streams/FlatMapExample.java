package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<String>> list = Arrays.asList(
		        Arrays.asList("A","B"),
		        Arrays.asList("C","D")
		);

		List<String> ls = list.stream().flatMap(Collection::stream)
		.map(String::toLowerCase)
		.toList();
		System.out.println(ls);
		boolean bs = ls.stream().anyMatch(n-> "a".equals(n));
		System.out.println(bs);
		
	
	}

}
