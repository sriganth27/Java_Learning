package streams.easyexamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import streams.Student;

public class StreemMediumExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.sort list of Employee by salary
		//2.calcultae the avarage age of a list of person object
		//3.partition number in even and odd
		//4.group the list of words by theire length using streams 
		//5.count occurance of each element in a list 
		//6.group Employee by department and calculate average salary 
		
		List<Employee> ls = Arrays.asList(new Employee(12,"it",23),
				new Employee(12,"sales",12),new Employee(12,"it",27),new Employee(12,"cse",34),new Employee(12,"it",21));
		
		List<Employee> sort  = ls.stream().sorted(Comparator.comparing(Employee::getName)).toList();
		System.out.println(sort);
		
		double res = ls.stream().mapToInt(Employee::getAge).average().getAsDouble();
		System.out.println(res);
		
		Map<Boolean,List<String>> result = ls.stream().
				collect(Collectors.partitioningBy((n->n.getAge()%2==0),
						Collectors.mapping(Employee::getName, Collectors.toList())));
		System.out.println("true values "+result.get(true));
		System.out.println("false values "+result.get(false));
		
		
		List<String> rs = Arrays.asList("apple","banana", "bat", "act","swim");
		Map<Integer,List<String>> rs1 = rs.stream().collect(Collectors.groupingBy(String::length));

		System.out.println(rs1);
		Map<Integer, List<String>> re1 = ls.stream().
				collect(Collectors.groupingBy(Employee::getAge,
						Collectors.mapping(Employee::getName,Collectors.toList())));
		System.out.println(re1);
		
		Map<String, Long> result1 = rs.stream().
				collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(result1);
		
		Map<String, Double> res3 = ls.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.averagingDouble(Employee::getAge)));
		
		System.out.println(res3);
}
}