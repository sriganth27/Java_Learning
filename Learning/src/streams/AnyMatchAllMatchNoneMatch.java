package streams;

import java.util.Arrays;
import java.util.List;

public class AnyMatchAllMatchNoneMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = Arrays.asList(2,4,1,2,5);
		
		boolean res = ls.stream().anyMatch(n->n%2==0);
		System.out.println(res);
		boolean res2 = ls.stream().allMatch(n->n%2==0);
		System.out.println(res2);
		boolean res3 = ls.stream().noneMatch(n->n%2==0);
		System.out.println(res3);

	}

}
