package test;

import java.util.HashMap;

public class CountTotalCharRepeat {
	public static void main (String[] args){
		String s = "Alive is awesome";
		System.out.println(repeatedChar(s));
	}
	
	public static HashMap<Character, Integer> repeatedChar(String s){
		HashMap<Character, Integer> values = new HashMap<Character, Integer>();
		char[] c1 = s.toCharArray();
		Character a;
		for(char c:c1){
			Integer frequency = values.get(c);
			values.put(c, frequency==null?1:frequency+1);
		}		
		return values;		
	}

}
