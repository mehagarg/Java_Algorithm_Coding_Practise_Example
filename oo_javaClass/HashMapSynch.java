package oo_javaClass;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapSynch {
	public static void main(String[] args){
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Alive");
		map.put(2, "is");
		map.put(3, "awesome");
		System.out.println(map);
		Map<Integer, String> synchMap = Collections.synchronizedMap(map);
		
		System.out.println(synchMap);
	}

}
