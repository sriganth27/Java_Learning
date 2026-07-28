package streams;

import java.util.Arrays;


public class SumAverageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30};
		int res = Arrays.stream(arr).sum();
		double  res2 = Arrays.stream(arr).average().getAsDouble();
		
		System.out.println(res);
		System.out.println(res2);

	}

}
