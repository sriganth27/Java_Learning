package streams.mediumExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostCommonFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> ls = Arrays.asList(new Employee(1,"sri","IT",25000),new Employee(1,"sri1","	CSE",25000),
				new Employee(1,"sri","IT",55000),new Employee(1,"sri","HR",56000),
				new Employee(1,"sri","HR",45000));
		
		Optional<Entry<Character, Long>> map = ls.stream().map(s->s.getName().charAt(0))
				.collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting())).entrySet().stream().
				max(Map.Entry.comparingByValue());
		
		System.out.println(map);

	}

}
