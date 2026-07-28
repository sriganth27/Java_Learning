package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = Arrays.asList(2,4,1,2,5);
		List<Integer> list = ls.stream().sorted().collect(Collectors.toList());
		System.out.println(list);
		
		List<Integer> list2 = ls.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list2);

	}

}