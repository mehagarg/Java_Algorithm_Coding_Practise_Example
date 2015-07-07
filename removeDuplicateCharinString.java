import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

// How to actually find duplicates in an array
// how to remove duplicates in an array  --removeDuplicateChars() done (this is using SET)
// how to find count of duplicates-- countCharinString() done (this is using MAP)




public class removeDuplicateCharinString {
	public static void main(String[] args){
		String a = "aaabbb";
		String b ="abc";
		System.out.println(removeDuplicateChars(a));
		System.out.println(removeDuplicateChars(b));
		
		System.out.println(removeDuplicateBruteForce(a));
		System.out.println(removeDuplicateBruteForce(b));
		
		System.out.println(removeDuplicateBruteForce1(a));
		System.out.println(removeDuplicateBruteForce1(b));
		
		System.out.println("----------------------------");
		System.out.println(countCharinString(b));
		System.out.println(countCharinString(a));
		System.out.println(countCharinString("love in tokyo"));
	}
	public static String removeDuplicateChars(String a){
		HashSet<Character> noDuplicates = new HashSet<Character>();
		for(int i=0; i<a.length(); i++){
			noDuplicates.add(a.charAt(i));
		}
		return noDuplicates.toString();
	}
	
	public static boolean removeDuplicateBruteForce(String a){
		char[] a1= a.toCharArray();
		for(int i=0; i<a1.length; i++){
			for(int j=0; j<a1.length; j++){
				if(a1[i] == a1[j] && i!=j){
					return true;
				}
			}
		}
		return false;
	}
	
	public static String removeDuplicateBruteForce1(String a){
		char[] a1= a.toCharArray();
		char[] noDuplicate = new char[a1.length];
		for(int i=0; i<a1.length; i++){
			for(int j=0; j<a1.length; j++){
				if(a1[i]==a1[j] && i!=j){
					noDuplicate[i] = a1[i];
				}
			}
		}
		return new String(Arrays.toString(noDuplicate));
	}
	
	// this is used to count occurences of a particular character in a string
	public static HashMap<Character, Integer> countCharinString(String a){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<a.length(); i++){
			Integer frequency = map.get(a.charAt(i));
			map.put(a.charAt(i), frequency == null?1:frequency+1);
		}
		
		return map;
	}

}
