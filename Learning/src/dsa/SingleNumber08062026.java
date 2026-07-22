package dsa;

import java.util.LinkedHashMap;
import java.util.Map;

public class SingleNumber08062026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,4,1,2};
		Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int num : arr){
            map.put(num , map.getOrDefault(num,0)+1);
        }
       
       for(Map.Entry<Integer,Integer> mp :map.entrySet()){
        if(mp.getValue() ==1) {
        	System.out.println(mp.getKey());
        }
       }
      int result =  singleNumber(arr);
      System.out.println(result);
	}
	
	public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num,0)+1);
        }

       for(Map.Entry<Integer,Integer> mp :map.entrySet()){
        if(mp.getValue() == 1){
            return mp.getKey();
        }
       }
	   return 0;
    }


}
