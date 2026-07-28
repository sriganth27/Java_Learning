package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = Arrays.asList(1,2,2,3,3,45,6);
		List<Integer> list = ls.stream().distinct().collect(Collectors.toList());
		System.out.println(list);

	}

}
