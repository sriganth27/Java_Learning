package streams;

import java.util.Arrays;
import java.util.List;

public class LimitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = Arrays.asList(2,4,1,2,5);

		ls.stream().limit(3).forEach(System.out::println);

	}

}
