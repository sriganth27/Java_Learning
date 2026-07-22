package dsa;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 567;
		int copy = a;
		int sum = 0;
		while(a !=0) {
			int lastDigit = a %10;
			sum = sum + lastDigit * lastDigit * lastDigit;
			a = a/10;
		}

		if(copy == sum) {
			System.out.println("armstromg");
		}
		else {
			System.out.println("not armstromg");
		}
	}

}
