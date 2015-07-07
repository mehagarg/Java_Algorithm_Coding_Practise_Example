package test;

import java.util.Arrays;
import java.util.HashMap;

public class Capitalize2_4_8_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("meha", 1);
		map.put("meha", 1);
		map.put(null, 0);
		
		map.get(null);
		// TODO Auto-generated method stub
		System.out.println(capitablize("letters in a string"));

	}
	
	public static String capitablize(String s){
		char[] c = s.toCharArray();
		
		for (int i=2; i<c.length; i*=2){
			c[i] = (char) (c[i]-32);		
		}
		
		return new String(Arrays.toString(c));
	}

}
