package dsa;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int num = -121;
		int numCopy = num;
		int rev = 0;
		int sum = 0;
		
		String value = String.valueOf(num);
		StringBuffer sb = new StringBuffer(value).reverse();
		System.out.println(sb);
		
		while(num!=0) {
			int lastDigit = num %10;
			rev = rev *10 + lastDigit;
			sum = sum + lastDigit;
			
			num = num/10;
		}
		
		System.out.println("the sum of "+ num + " is " + sum);
		if(numCopy == rev) {
			System.out.println("palindrome is true");
		}
		else {
			System.out.println("not a palindrome number" + rev);
		}
	}

}
