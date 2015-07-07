import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class anagramStrings {
	public static void main(String[] args){
		String a="", b=" ";
		System.out.println(isAnagram(a, b));
		System.out.println(isAnagramWithLessTimeComplexity(a, b));
	}
	
	public static boolean isAnagram(String a, String b){
		// due to sorting it gives time complexity to be n*log(n);
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
		
		return new String(a1).equals(new String(b1));
		
	}
	
	public static boolean isAnagramWithLessTimeComplexity(String a, String b){
		// due to sorting it gives time complexity to be O(n);
		if(a.length() != b.length()){
			return false;
		}
		
		return frequencyMap(a).equals(frequencyMap(b));
	}
	public static Map<Character, Integer> frequencyMap(String a){
		char[] a1 = a.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c: a1){
			Integer frequency = map.get(c);
			map.put(c, frequency==null?1:frequency+1);
		}
		
		return map;
		
	}

}
