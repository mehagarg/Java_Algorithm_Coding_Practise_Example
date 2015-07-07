package simpleCoding_algo;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("abcabcbb"));

	}
	
	public static int  lengthOfLongestSubstring(String s){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] c = s.toCharArray();
		
		int pre = 0;
		
		for(int i=0 ; i<c.length; i++){
			if(!map.containsKey(c[i])){
				map.put(c[i], i);
			}
			else{
				pre = Math.max(pre, map.size());
				i = map.get(c[i]);
				
				map.clear();
			}
		}
		
		return Math.max(pre, map.size());
	}

}
