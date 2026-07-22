package dsa;

public class ReverseNumber {

	public static int reverseMethod(int n) {
       int rev = 0;
		
		while (n !=0) {
			int ldigit = n %10;
			n = n /10;
			
			if(rev > Integer.MAX_VALUE /10 || (rev ==  Integer.MAX_VALUE && ldigit > 7)) {
				return 0;
			}
			
			if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE && ldigit < -8 )){
				return 0;
			}
			
			rev = rev *10 + ldigit;
			
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = -123;
		int rev = 0;
		// method 1
//		while(number>0) {
//			int lastDigit  = number %10;
//			rev = rev * 10 + lastDigit;
//			number = number /10;
//		}
		
		System.out.println(rev);
		
		int result = ReverseNumber.reverseMethod(number);
		System.out.println(result);
		// method 2 
		
		

	}

}
