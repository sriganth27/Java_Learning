package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = Arrays.asList(1,2,3,45,6);
		List<Integer> res = ls.stream()
		.map(n-> n*n)
		.collect(Collectors.toList());
		
		System.out.println(res);

	}

}
