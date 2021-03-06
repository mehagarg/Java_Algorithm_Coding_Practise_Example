import java.util.HashMap;

/**
 *       You have a large text file containing words. 
 * Given any two words, find the shortest distance (in terms of number of words) between them in the file. 
 * Can you make the searching operation in O(1) time? What about the space complexity for your solution?
 * @author meha
 *
 */

public class MinDistanceBetweenWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] words = {"this","is", "meha", "garg", "hi", "there", "garg", "alpha", "beta", "garg", "this","is", "meha"};
		String word1 = "meha";
		String word2 = "alpha";
		
		String word3 = "garg";
		String word4 = "this";
		
//		System.out.println(minDistance(words, word1, word2));
		System.out.println("---------");
//		System.out.println(minDistanceUsingHash(words, word1, word2));
		
		System.out.println("---------");
//		System.out.println(minDistanceWithRepeatedWords(words, word1, word2));
		
		System.out.println(minDistanceWithRepeatedWords(words, word3, word4));
	}
	
	public static int minDistanceWithRepeatedWords(String[] words, String word3, String word4){
		HashMap<Integer, String> mapWord1 = new HashMap<Integer, String>();
		HashMap<Integer, String> mapWord2 = new HashMap<Integer, String>();
		for(int i=0 ; i<words.length; i++){
			if(words[i] == word3){
				mapWord1.put(i, word3);
			}
			if(words[i] == word4){
				mapWord2.put(i, word4);
			}
		}
		int distance = 0;		
		int min = 0;
		
		for(Integer key1: mapWord1.keySet()){
			for(Integer key2 : mapWord2.keySet()){
				System.out.println("key1 " + key1 + " key2 = " + key2 );
				distance = Math.abs(key1 - key2);
				min = distance;
				System.out.println("distance = " + distance);
				if(min > distance){
					min = distance;
				}
			}
		}

//		while(mapWord1.entrySet().iterator().hasNext()){
//			while(mapWord2.entrySet().iterator().hasNext()){
//				Integer key1 = mapWord1.entrySet().
//				distance = (mapWord1.getKey()) - (mapWord2.keySet().iterator().next()); 
//				if(min > distance){
//					min = distance;
//				}
//			}
//		}
		return min;
		
	}
	public static int minDistanceUsingHash(String[] words, String word3, String word4){		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<words.length; i++){
			map.put(words[i], i);
		}
		
		int distance = map.get(word3) - map.get(word4);
		return distance;
	}
	
	public static int minDistance(String[] words, String word1, String word2){
		int pos = 0;
		int min = Integer.MAX_VALUE/2;
		int word1_pos = -min;
		int word2_pos = -min;
		for(int i=0; i<words.length; i++){
			String current_word = words[i];
			if(current_word.equals(word1)){
				word1_pos = pos;
				int distance =  word1_pos - word2_pos;
				if(min>distance){
					min = distance;
				}
			}
			else if(current_word.equals(word2)){
				word2_pos = pos;
				int distance =  word2_pos - word1_pos;
				if(min>distance){
					min = distance;
				}
			}
			++pos;
		}
		
		
		return min;
	}

}
