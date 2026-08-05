package streams.mediumExamples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MediumExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.find the higest paid employee in each department
		//2.find all departments with more than 2 employee
		//3.find department with highest average salary
		//4.find most ferequent characted in string
		//5.find first non repetive character in string

		List<Employee> ls = Arrays.asList(new Employee(1,"sri","IT",25000),new Employee(1,"sri1","	CSE",25000),
				new Employee(1,"sri","IT",55000),new Employee(1,"sri","HR",56000),
				new Employee(1,"sri","HR",45000));
		
		//1.find the higest paid employee in each department
		Map<String, Optional<Employee>> res = ls.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		System.out.println(res);
		
		//2.find all departments with more than 2 employee
		Map<String, Object> res1 = ls.stream().collect
				(Collectors.groupingBy(Employee::getDepartment,
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
								Optional::get)
				));
		System.out.println(res1);
		
		//3.find department with highest average salary
		Map<String,Long> res2 = ls.stream().collect(Collectors.groupingBy
				(Employee::getDepartment,Collectors.counting()));
		System.out.println(res2);
		
		List<Map.Entry<String, Long>> res3 = res2.entrySet().stream().filter(n-> n.getValue()>1).toList();
		System.out.println(res3);
		
		//4.find most ferequent characted in string
		Map<String,Double> res5 = ls.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(res5);
		Map.Entry<String, Double> res7 = res5.entrySet().stream().collect(Collectors.maxBy(Comparator.comparing(n->n.getValue()))).orElseThrow();
		Map.Entry<String, Double> res6 = res5.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
		System.out.println(res6);
		System.out.println(res7);
		
		Map.Entry<String, Double> res8 = ls.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.averagingDouble(Employee::getSalary))).entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
	
		
		System.out.println(res8);
		
	}

}
