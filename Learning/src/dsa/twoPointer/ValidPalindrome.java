package dsa.twoPointer;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String s = "A man, a plan, a canal: Panama";
		boolean bl1 = findPalindromeMethod(s);
		System.out.println(bl1);
		s= s.replaceAll("[^a-zA-Z]", "").toLowerCase();
		System.out.println(s);
		boolean bl = findPalindrome(s);
		System.out.println(bl);
	}

	private static boolean findPalindromeMethod(String s) {
		// TODO Auto-generated method stub
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			
			while(i<j&& !Character.isLetterOrDigit(s.charAt(i))) {
				i++;
			}
			while(i<j&& !Character.isLetterOrDigit(s.charAt(j))) {
				j--;
			}
			if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	private static boolean findPalindrome(String s) {
		// TODO Auto-generated method stub
		
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
