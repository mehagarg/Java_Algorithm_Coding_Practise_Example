package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class RecursivePrintListContainingList {
	public static void main(String[] args){
		List<String> list = Arrays.asList("we", "have");
		List<String> l1 = Arrays.asList("applie", "banana", "chickoo");
		List<List<String>> l2 = new ArrayList<List<String>>();
		l2.add(list);
		l2.add(l1);
		System.out.println(l2);
		Iterator<List<String>> iter = l2.iterator();
		while(iter.hasNext()){
			Iterator<String> siter = iter.next().iterator();
			while(siter.hasNext()){
				System.out.println(siter.next());
			}
			
			
		}
		
		print(l2, "", 0);
	}
	
	public static void print(List list, String output, Integer listIndex){
		if(list.size() == listIndex){
			System.out.println(output);
			return;
		}
		List<String> curr = (List<String>) list.get(listIndex);
		for(String str:curr){
			print(list, output + " " + str, listIndex+1);
		}
	}

}
