package streams.mediumExamples;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MostFrequentChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "banana";
		
		IntStream inp =str.chars();
		inp.forEach(System.out::println);
		
		Map.Entry<Character, Long> res =str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy
				(Function.identity(),Collectors.counting())).entrySet().stream().
		max(Map.Entry.comparingByValue()).orElseThrow();
		
		System.out.println(res);

	}

}
