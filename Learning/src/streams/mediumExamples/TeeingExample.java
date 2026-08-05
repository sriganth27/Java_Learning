package streams.mediumExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TeeingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Find Sum and Count Together
		List<Integer> list = Arrays.asList(10, 20, 30, 40);
		
	   String res =  list.stream().collect(Collectors.teeing(
	    		Collectors.summarizingInt(Integer::intValue), 
	    		Collectors.counting(), 
	    		(sum,count)-> "sum is"+ sum +  "count is" + count));
	   
	   
	   
	   System.out.println(res);
	   
	   String res1 =  list.stream().collect(Collectors.teeing(
	    		Collectors.summingInt(Integer::intValue), 
	    		Collectors.counting(), 
	    		(sum,count)-> "sum is"+ sum +  " count is" + count));
	   System.out.println(res1);

	   //2.Average Without average()
	  double db =  list.stream().collect(Collectors.teeing(
			   Collectors.summingInt(Integer::intValue),
			   Collectors.counting(), 
			   (s,c)-> (double)s/c));
	  System.out.println(db);
	}

}
