package streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;


public class SummaryStatisticsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30};
		
		IntSummaryStatistics res = Arrays.stream(arr).summaryStatistics();
		System.out.println(res.getAverage());
		System.out.println(res.getCount());
		System.out.println(res.getMax());
		System.out.println(res.getMin());
		System.out.println(res.getSum());

	}

}
