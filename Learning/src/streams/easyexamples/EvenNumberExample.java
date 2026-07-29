package streams.easyexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EvenNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = Arrays.asList(2,4,1,2,5);
		
		List<Integer> rs = ls.stream().filter(n-> n%2==0).toList();
		System.out.println(rs);
		
		List<Integer> rs1 =  ls.stream().filter(n-> n%2==0).map(n-> n*n).toList();
		System.out.println(rs1);
		
		Optional<Integer> rs2= ls.stream().filter(n->n>2).sorted().findFirst();
		System.out.println(rs2.get());
		
		long rs3= ls.stream().filter(n->n>2).sorted().count();
		System.out.println(rs3);

		Integer sum = ls.stream().reduce(0,(a,b)-> a+b);
		System.out.println(sum);
		
		Optional<Integer> prod = ls.stream().filter(n-> n%2==0).peek(System.out::println).
				reduce((a,b)-> a*b);
		System.out.println(prod.get());
		
		Optional<Integer> max = ls.stream().max(Integer::max);
		System.out.println(max.get());
		
		Optional<Integer> min = ls.stream().min(Integer::min);
		
		System.out.println(min.get());
		
	}

}
