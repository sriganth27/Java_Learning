package streams.mediumExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SlidingWindowAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ls.sublist();
		List<Integer> ls = Arrays.asList(1,2,3,4,5,6);
		int window = 3;
		System.out.println(ls.size());
		List<List<Integer>> list = IntStream.range(0, ls.size()-(window-1)).mapToObj(i->ls.subList(i, i+window))
				.toList();

		System.out.println(list);
		
		List<Double> res = IntStream.range(0, ls.size()-(window-1)).mapToObj(i->ls.subList(i, i+window))
		.map(w->w.stream().mapToInt(Integer::intValue).average().orElse(0)).toList();
		
		
		System.out.println(res);
		
		List<Double> res4 = IntStream.range(0, 
				ls.size()-(window-1)).mapToObj(i->(ls.get(i) + ls.get(i+1) + ls.get(i+2)/3.0)).toList();
		System.out.println(res4);
		
		
	}

}
