package streams.mediumExamples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepetiveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "swiss";
		Optional<Map.Entry<Character,Long>> res =str.chars().mapToObj(c->(char) c).collect(Collectors.
				groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
		.filter(s->s.getValue()==1).findFirst();
		
		System.out.println(res);
		
		Optional<Map.Entry<Character,Long>> res1 =str.chars().mapToObj(c->(char) c).collect(Collectors.
				groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream()
		.filter(s->s.getValue()==1).findFirst();
		
		System.out.println(res1);

	}

}
