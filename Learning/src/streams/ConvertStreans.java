package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertStreans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3,4};
		Integer [] arr1 = {1,2,3,4};
		
		final IntStream is = Arrays.stream(arr);
		is.forEach(System.out::println);
		
		final Stream<Integer> is1 = Stream.of(arr1);
		is1.forEach(System.out::println);
		
		List<Integer> ls = Arrays.asList(1,2,3,4);
		ls.stream().filter(e -> e>2)
		.map(e->e*2)
		.forEach(System.out::println);
		
		
	}

}


