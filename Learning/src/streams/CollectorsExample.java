package streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> ls = Arrays.asList(
			    new Student(1,"John","IT",80),
			    new Student(2,"David","CSE",65),
			    new Student(3,"Sam","IT",90),
			    new Student(4,"Tom","ECE",55)
			);
		
		// 1.toList
		List<String> res = ls.stream().map(Student::getName).toList();
		System.out.println(res);
		
		// 2. toSet
		
		Set<String> set = ls.stream().map(Student::getDept).collect(Collectors.toSet());
		System.out.println(set);
		
		
		// 3.toMap
		
		Map<Integer,String> map = ls.stream().collect(Collectors.toMap(Student::getRoll, Student::getName));
		System.out.println(map);

		// 4.join
		String result = ls.stream().map(Student::getName)
		.collect(Collectors.joining(", "));
		
		System.out.println(result);
		
		// 5.groupingBy
		
		
	   Map<String,List<Student>> map2 = ls.stream().collect(Collectors.groupingBy(Student::getDept));
	   System.out.println(map2);
	   
	   Map<String, List<String>> map3 =
			   ls.stream()
			   .collect(Collectors.groupingBy(Student::getDept , Collectors.mapping(Student::getName, Collectors.toList())));

			   System.out.println(map3);
			   
		// 6.partitioningBy
			   
	   Map<Boolean, List<String>> res4 =    ls.stream().collect(Collectors.partitioningBy(s-> s.getMarks()>=70,
					                         Collectors.mapping(Student::getName, Collectors.toList())));
	   System.out.println(res4);
			   
	   
	   // 7 . counting
	   
	   Long count = ls.stream()
               .collect(Collectors.counting());

       System.out.println(count);
       
       // 8.summingInt
       
       int total = ls.stream().collect(Collectors.summingInt(Student::getMarks));
       System.out.println(total);
       
       // 9.averagingInt
       double avg = ls.stream()
               .collect(Collectors.averagingInt(Student::getMarks));

      System.out.println(avg);
       
      //10.summarizingInt
      IntSummaryStatistics stat =
    		  ls.stream()
    		  .collect(Collectors.summarizingInt(Student::getMarks));

    		  System.out.println(stat.getCount());
    		  System.out.println(stat.getSum());
    		  System.out.println(stat.getMin());
    		  System.out.println(stat.getMax());
    		  System.out.println(stat.getAverage());
	}
}
