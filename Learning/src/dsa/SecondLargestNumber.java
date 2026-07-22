package dsa;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,1,3,0};
		int min = Integer.MAX_VALUE;
		int s_min = Integer.MAX_VALUE;
		
		int max = Integer.MIN_VALUE;
		int s_max = Integer.MIN_VALUE;
		
		for(int num : arr) {
			if(max < num) {
				s_max = max;
				max = num;
			}
			else if(s_max < num && num != max) {
				s_max = num;
			}
		}
		
		for(int num: arr) {
			if(min> num) {
				s_min = min;
				min = num;
			}
			else if(s_min> num) {
				s_min = num;
			}
		}
		System.out.println("max is "+ max);
		System.out.println("s_max is "+s_max);
		System.out.println("min is "+ min);
		System.out.println("s_min is "+s_min);
		

	}

}
