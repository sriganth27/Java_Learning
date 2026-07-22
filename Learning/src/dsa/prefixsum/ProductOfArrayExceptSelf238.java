package dsa.prefixsum;

import java.util.Arrays;

public class ProductOfArrayExceptSelf238 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = {2,3,4,5};
		int result [] = findMethod(num);
		System.out.println(Arrays.toString(result));
	}

	private static int[] findMethod(int[] num) {
		// TODO Auto-generated method stub
		int [] res = new int[num.length];
		res[0] = 1;
		for(int i=1;i<num.length;i++) {
			res[i] = res[i-1]*num[i-1];
		}
		int prod =1;
		for(int j=num.length-1;j>=0;j--) {
			res[j] = res[j]*prod;
			prod = prod*num[j];
		}
		return res;
	}

}
