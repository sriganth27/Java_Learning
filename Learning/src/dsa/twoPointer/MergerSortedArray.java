package dsa.twoPointer;

import java.util.ArrayList;
import java.util.List;

public class MergerSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums1 = {1,2,3,0,0,0};
		int m = 3,  n = 3;
		int []nums2 = {2,5,6};
		List<Integer> ls = merge(nums1,m,nums2,n);
		System.out.println(ls);
	}
    public static  List<Integer> merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        List<Integer> ls =  new ArrayList<>();
    	while(i<m && j<n) {
    		if(nums1[i]<=nums2[j]) {
    			ls.add(nums1[i]);
    			i++;
    		}
    		else {
    			ls.add(nums2[j]);
    			j++;
    		}
    	}
    	while(i<m) {
    		ls.add(nums1[i]);
    		i++;
    	}
    	while(j<n) {
    		ls.add(nums2[j]);
    		j++;
    	}
    	return ls;
    }
}
