package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PermutationOfString {
	public static void main(String[] args){
		//permutation("ABC");
	//	"abc".toUpperCase();
		permutation("abc");
		
	}

	public static void permutation(String s){
		perumutation("", s);
	}
	private static void perumutation(String prefix, String s) {
		int len = s.length();
		if(len == 0){
			System.out.println(prefix);
		}
		else{
			for(int i=0; i<len; i++){
				perumutation(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, len));
//				perumutation((prefix + s.charAt(i)).toUpperCase(), s.substring(0, i) + s.substring(i+1, len));
			}
			
		}
	}

}
