package dataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {
	public static void main(String[] args){
		List list = new ArrayList();
		list.add("Meha");
		list.add("Sanju");
		list.add("Mena");
		list.add("Snju");
		list.add("Meha");
		list.add("Sanju");
		list.add("Mena");
		list.add("Snju");
		System.out.println( "array list" + list);
		
		List lls = new LinkedList<Object>();
		lls.add("Meha");
		lls.add("Sanju");
		lls.add("Mena");
		lls.add("Snju");
		lls.add("Meha");
		lls.add("Sanju");
		lls.add("Mena");
		lls.add("Snju");
		System.out.println( "linked list" + lls);
		
		Set hs = new HashSet<Object>();
		hs.add("Meha");
		hs.add("Sanju");
		hs.add("Mena");
		hs.add("Snju");
		hs.add("Meha");
		hs.add("Sanju");
		hs.add("Mena");
		hs.add("Snju");
		System.out.println( "hash set" + hs);
		
		Map map = new HashMap();
		map.put("Meha", 1);
		map.put("Sanju",2);
		map.put("Mena",3);
		map.put("Snju", 4);
		map.put("Meha1", 1);
		map.put("Sanju2", 2);
		map.put("Men3",3);
		map.put("Snju", 8);
		System.out.println( "hash map" +map);
	}
}
