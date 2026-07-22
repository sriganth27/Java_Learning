package dsa.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBucket904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//07-07-2026
		int fruits[] = {1,2,3,2,2};
		int result = findMethod1(fruits);

		System.out.println(result);
		int result2= findMethod2(fruits);

		System.out.println(result2);
				
	}

	private static int findMethod1(int[] fruits) {
		// TODO Auto-generated method stub
		int ans =0;
		for(int l=0; l<fruits.length;l++) {
			int count =0;
			Map<Integer,Integer> map = new HashMap<>();
			for(int r=l;r<fruits.length;r++) {
				map.put(fruits[r], map.getOrDefault(fruits[r], 0)+1);

				if(map.size()>2) {
					break;
				}
				count ++;
				ans = Math.max(ans, count);
			}
			
		}
		return ans;
	}
	private static int findMethod2(int[] fruits) {
		// TODO Auto-generated method stub
		int ans =0;
		int l=0;
		Map<Integer,Integer> map = new HashMap<>();
		for(int r=0;r<fruits.length;r++) {
		
			map.put(fruits[r], map.getOrDefault(fruits[r], 0)+1);
			while(map.size()>2) {
				map.put(fruits[l], map.get(fruits[l])-1);
				if(map.get(fruits[l]) == 0) {
					map.remove(fruits[l]);
				}
				l++;
			}
			ans = Math.max(ans, r-l+1);
		}
			
		
		return ans;
		
	}

}
