package streams;

import java.util.Arrays;
import java.util.List;

public class SkipExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// skip first n numbers
		List<Integer> ls = Arrays.asList(2,4,1,2,5);
		ls.stream().skip(1).forEach(System.out::println);
	}

}
