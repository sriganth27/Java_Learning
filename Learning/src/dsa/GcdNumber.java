package dsa;

public class GcdNumber {

	public  static int findGcd(int a , int b) {
		
		int gcd = 1;

		
		for( int i=Math.min(a, b); i > 0 ;i--) {
			if(a % i ==0 && b % i ==0) {
                 return i;
    
			}
		}
		return gcd;
		
		// Mthod 2 
//		for( int i=Math.min(a, b); i > 0 ;i--) {
//			if(a % i ==0 && b % i ==0) {
//                 return i;
//    
//			}
//		}
//		return 1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =99;
		int b = 6;
		
		int result = GcdNumber.findGcd(a, b);
		System.out.println(result);

	}

}
