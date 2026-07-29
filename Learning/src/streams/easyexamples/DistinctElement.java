package streams.easyexamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DistinctElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = Arrays.asList(2, 4, 1, 2, 5);

		List<List<Integer>> lis = Arrays.asList(Arrays.asList(2, 4, 1, 2, 5), Arrays.asList(24, 5, 6, 8),
				Arrays.asList(5, 6, 2, 3, 4));

		List<String> st = Arrays.asList("test", "yiu", "xyx", "text");

		// 1.Find all distinct elements
		List<Integer> res = ls.stream().distinct().toList();
		System.out.println(res);

		// 2.Find the average
		double avg = ls.stream().mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println(avg);

		// 3. sort the elements
		List<Integer> sort = ls.stream().sorted(Comparator.reverseOrder()).toList();
		List<Integer> sortDes = ls.stream().sorted(Comparator.naturalOrder()).toList();
		System.out.println(sort);
		System.out.println(sortDes);

		// 4. count how many strings start with t
		long length = st.stream().filter(n -> n.startsWith("t")).count();
		System.out.println(length);

		String result = st.stream().collect(Collectors.joining(", ", "{", "}"));
		System.out.println(result);

		// 6. check all value are positive
		boolean te = ls.stream().allMatch(n -> n > 0);
		System.out.println(te);

		// 7. any number devisible by 3
		boolean t = ls.stream().anyMatch(n -> n % 3 == 0);
		System.out.println(t);

		// 8 . flatter 
		List<Integer> lst = lis.stream().flatMap(List::stream).map(n -> n * n).toList();

		System.out.println(lst);
		
		//9.First non empty string
		List<String> sts = Arrays.asList(""," ","test","","hello");
		List<String> results= sts.stream().filter(n->!n.isEmpty()).toList();
		System.out.println(results);
		
		Optional<String> opt = sts.stream().filter(n->!n.isBlank()).findFirst();
		System.out.println(opt.get());
		
		//10. find the second largest element
		
		Optional<Integer> sk = ls.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(sk.get());

	}

}
