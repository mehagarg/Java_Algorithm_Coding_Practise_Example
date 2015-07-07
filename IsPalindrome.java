
public class IsPalindrome {
	public static void main(String[] args) {
		String s = "Niagara. O roar again!";
		String s1 = "Madam, I'm'',.,.''   Adam";
		System.out.println(palindromeCheck(s));
		System.out.println(palindromeCheck(s1));
		
		System.out.println(" ---------------palindromeCheck--------------");
		System.out.println(isPalindromeRecursive(s));
		System.out.println(isPalindromeRecursive(s1));
	}

	private static boolean palindromeCheck(String s) {
		s = s.toLowerCase().replaceAll("\\W", "");
		char[] c = s.toCharArray();
		
		for(int i=0, j=s.length()-1; i<s.length()/2; i++, j--){
			if(c[i] != c[j]){
				return false;
			}
		}
		return true;
	}
	
	//recursive palindrome function
	private static boolean isPalindromeRecursive(String s){
		s = s.toLowerCase().replaceAll("\\W", "");
		if(s.length() == 0 || s.length() == 1){
			return true;
		}
		if(s.charAt(0) == s.charAt(s.length()-1)){
			return isPalindromeRecursive(s.substring(1, s.length()-1));
		}
		return false;
	}
}
