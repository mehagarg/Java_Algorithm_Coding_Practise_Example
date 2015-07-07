package dataStructure;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String args[]){
		Map<Integer, Character> map = new HashMap<Integer, Character>();
		map.put(1, 'c');
		map.put(2, 'c');
		map.put(3, 'c');
		map.put(0, 'c');
		System.out.println(map.entrySet());
		System.out.println(map);
		for(int i=0; i<map.size(); i++){
			System.out.println(map.get(i));
		}

		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue('c'));
		
		System.out.println(map.containsValue(1));
		
		System.out.println(map.get(1));
		
		System.out.println(map.keySet());
		
		Map m2 = new HashMap<Object, Object>();
		m2.putAll(map);
		
		map.clear();
		System.out.println( "on clear" + map);
		
		System.out.println(m2);
	}
}
