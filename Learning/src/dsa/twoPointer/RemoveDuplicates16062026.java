package dsa.twoPointer;

public class RemoveDuplicates16062026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,2,3,3,4,5,6,6};
		int result = findDuplicates(arr);
		System.out.println(result);
	}

	private static int findDuplicates(int[] arr) {
		// TODO Auto-generated method stub
		int i=0;
		for(int j=0; j<arr.length;j++) {
			if(arr[i]!=arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return i+1;
	}

}
