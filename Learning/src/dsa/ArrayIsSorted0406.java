package dsa;

public class ArrayIsSorted0406 {
	//Test
	public static boolean checkSorted(int arr[]) {
		
		for(int i=0; i< arr.length-1 ; i++) {
			if(arr[i] > arr[i+1]) {
				return false;
			}
		}
		return true;
		
	}

	public static boolean checkSortedDesc(int arr[]) {
		
		for(int i = arr.length -1 ; i>0 ; i--) {
			if(arr[i] >= arr[i-1]) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,3,2,2,1};

		
		boolean result = ArrayIsSorted0406.checkSortedDesc(arr);
		System.out.println(result);
	}

}
