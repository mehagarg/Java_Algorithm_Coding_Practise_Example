package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class RunLengthEncoding {
	public static void main(String[] args){
//		System.out.println(runLE("wwwxxx"));
		runLE("wwwxxx");
	}
	
	public static void runLE(String s){
		char[] a = s.toCharArray();
		HashSet<Character> set1 = new HashSet<Character>();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c:a){
			Integer frequency = map.get(c);
			map.put(c, frequency == null?1:frequency+1);
			set1.add(c);
			System.out.println(set1);
		}
		Iterator<Character> iter = set1.iterator(); 
		StringBuilder sb = new StringBuilder();
		while(iter.hasNext()){		
			
			sb.append(iter.next());
			sb.append(map.get(iter.next()));
			}
		System.out.println(sb);
		return;
	}

}
