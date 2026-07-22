package dsa.twoPointer;

public class ContainerWithMostWater22062026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] height = {1,8,6,2,5,4,8,3,7};
		int res1 = findCall(height);
		System.out.println(res1);
		int res2 = findCall2(height);
		
		System.out.println(res2);
	}

	private static int findCall(int[] arr) {
		// TODO Auto-generated method stub
		int max = 0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int height = Math.min(arr[i], arr[j]);
				int width = j-i;
				int area = height*width;
				max = Math.max(max, area);
			}
		}
		return max;
	}

	private static int findCall2(int[] arr) {
		// TODO Auto-generated method stub
		int max = 0;
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int height = Math.min(arr[i], arr[j]);
			int width = j-i;
			int area = height*width;
			max = Math.max(max, area);
			if(arr[i]<=arr[j]) {
				i++;
			}
			else {
				j--;
			}
		}
		return max;
	}

}
