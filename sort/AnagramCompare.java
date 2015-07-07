package sort;

import java.util.Arrays;
import java.util.Comparator;

public class AnagramCompare {
	public static void main(String[] args){
		String[] strArray = new String[]{"abets", "mates", "baste", "meats"};

		Arrays.sort(strArray, new AnagramComparator());
		
		for(String s: strArray){
			System.out.println(s);
		}
	}

}

class AnagramComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return sort(s1).compareTo(sort(s2));
	}
	
	private String sort(String s){
		char[] c = s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
}

