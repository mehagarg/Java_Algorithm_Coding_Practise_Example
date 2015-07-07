package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursviePrintSentence {
	public static void main(String[] args) {
		List<String> l1 = Arrays.asList(new String[]{"you","we"});
		List<String> l2 = Arrays.asList(new String[]{"have","are"});
		List<String> l3 = Arrays.asList(new String[]{"apple","banana","cherry", "fan"});
		List<List<String>> l4 = new ArrayList<List<String>>(3);
		l4.add(l1);l4.add(l2);l4.add(l3);
		System.out.println(l4);
		print(l4,"",0);
	}
	
	public static void print(List<List<String>> list, String output, int listIndex) {
		if(listIndex == list.size()) {
			System.out.println(output);
			return;
		}
		List<String> curr = list.get(listIndex);
		for(String str: curr) {
			print(list, output+" " + str, listIndex+1);
		}
	}
}
