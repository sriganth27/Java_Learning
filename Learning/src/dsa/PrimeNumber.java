package dsa;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 9;
		boolean isPrime = true;
		System.out.println(Math.sqrt(a));
		for(int i =2 ; i<= Math.sqrt(a) ; i++) {
			if(a%i ==0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not a primt number");
		}
	}

}
