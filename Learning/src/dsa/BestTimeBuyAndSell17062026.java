package dsa;

public class BestTimeBuyAndSell17062026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,9,8,3,6,4};
		int res = findBuyAndSell(arr);
		System.out.println(res);
		int res2 = findBuyAndSellMethod2(arr);
		System.out.println(res2);

	}

	private static int findBuyAndSellMethod2(int[] arr) {
		// TODO Auto-generated method stub
		int min = arr[0];
		int max = 0;
		for(int i=1;i<arr.length;i++) {
			int sum = arr[i]-min;
			min = Math.min(min, arr[i]);
			max = Math.max(max, sum);
			
		}
		return max;
	}

	private static int findBuyAndSell(int[] arr) {
		// TODO Auto-generated method stub
		int sum =0;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length;j++) {
				sum = arr[j] - arr[i];
				max = Math.max(sum,max);
			}
		}
		return max;
	}

}
