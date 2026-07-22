package dsa;

public class LcmNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5; 
		int b = 15;
		int gcd = 1;
		for(int i = Math.min(a, b) ; i>0 ; i--) {
			if(a % i == 0 && b % i == 0) {
				gcd = i;
				break;
			}
		}
		
		int lcm = a*b / gcd;
		System.out.println(lcm);
		

	}

}
