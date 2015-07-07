package dataStructure;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class LinkedList<T> implements Iterable<T> {
	private Node<T> head;
	
	private static class Node<T>{
		private T data;
		private Node<T> next;
		public Node(T data, Node<T> next){
			this.data = data;
			this.next = next;
		}
	}
	
	public LinkedList() {
		// constructs an empty list
		head = null;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public void addFirst(T item){
		head = new Node<T>(item, null);
	}
	
	public T getFirst(){
		if(head == null) throw new NoSuchElementException();
		return head.data;
	}
	
	public T removeFirst(){
		T temp = getFirst();
		head = head.next;
		return temp;
	}
	
	public void addLast(T item){
		if(head == null){
			addFirst(item);
		}
		Node<T> temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = new Node<T>(item, null);
	}
	
	public T getLast(){
		Node<T> temp = head;
		while(temp.next!=null){
			temp = temp.next;
		}
		return temp.data;
	}
	
	public void clear(){
		head = null;
	}
	
	public boolean contains(T data){
		for(T temp: this){
			if(temp.equals(data)){
				return true;
			}
		}
		return false;
	}
	
	public void insertAfter(T key, T toInsert){
		Node<T> temp = head;
		while(temp!=null && !temp.data.equals(key)){
			temp = temp.next;
		}
		temp.next = new Node<T>(toInsert, temp.next);
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
