package dsa.twoPointer;

import java.util.Arrays;

public class SqureOfSortedArray16062026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int arr [] = {-4,-1,0,3,10};
		int res [] = sortedSquares(arr);
		System.out.println(Arrays.toString(res));
	}
	public static int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length -1;
        int result = nums.length -1;
        int res [] = new int[nums.length];
        while(i<j){
          if(Math.abs(nums[i])< Math.abs(nums[j])){
        	  res[result--] = nums[j] * nums[j];
            j--;
          }
          else {
        	  res[result--] = nums[i] * nums[i];
            i++;
          }

        }
        return res;
    }
}
