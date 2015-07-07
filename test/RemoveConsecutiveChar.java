package test;

import java.util.Arrays;

public class RemoveConsecutiveChar {
	public static void main(String[] args){
		
		System.out.println(removeConsecChar("aaab", 2));
		System.out.println(removeConsecChar("aabb", 1));
		System.out.println(removeConsecChar("abababab", 3));
	}
	
	public static String removeConsecChar(String string, int limit){
		String processed = "";
		
		if(!string.isEmpty()){
			char currentChar = string.charAt(0);
			int matches = 1;
			processed = processed + currentChar;
			
			for(int i=1; i<string.length(); i++){
				if(currentChar == string.charAt(i)){
					matches++;
					if(matches <= limit){
						processed = processed + string.charAt(i);
					} 
				}else{
						currentChar = string.charAt(i);
						matches = 1;
						processed = processed + currentChar;
					}
				}
			}
		
		return processed;
	}

}
