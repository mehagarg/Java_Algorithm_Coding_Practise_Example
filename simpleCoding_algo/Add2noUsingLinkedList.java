package simpleCoding_algo;

import java.util.Iterator;
import java.util.LinkedList;

public class Add2noUsingLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> li = new LinkedList<Integer>();
		LinkedList<Integer> li2 = new LinkedList<Integer>();
		li.add(3);
		li.add(5);
//		Iterator<Integer> iter = li.iterator();
		
		int i = li.size();
		while(i>=0){
			li2.add(li.get(i));
			i--;
		}
		
		Iterator<Integer> iter1 = li2.iterator();
		while(iter1.hasNext()){
			System.out.println(iter1.next());
		}
		

	}
	
	

}
