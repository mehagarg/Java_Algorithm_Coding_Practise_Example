package test;

import java.util.HashMap;

public class FirstNonRepeatedChar {
	public static void main (String[] args){
		String s = "stress";
		System.out.println(nonRepeatedChar(s));
	}
	
	public static Character nonRepeatedChar(String s){
		HashMap<Character, Integer> values = new HashMap<Character, Integer>();
		char[] c1 = s.toCharArray();
		Character a;
		for(char c:c1){
			Integer frequency = values.get(c);
			values.put(c, frequency==null?1:frequency+1);
		}
		for(int i=0; i<c1.length; i++){
			a = s.charAt(i);
			if(values.get(a)==1){
				return a;
			}
		}
		return null;
		
	}

}
