package dataStructure;

public class ReverseLinkedList {
	public static class Node{
		private String data;
		private Node next;
		
		public Node(String data){
			this.data = data;
		}
		
		public String data(){
			return data;
		}
		
		public Node next(){
			return next;
		}
		
		public void setData(String data){
			this.data = data;
		}
		
		public void setNode(Node next){
			this.next = next;
		}
		
		public String toString(){
			return this.data;
		}
	}
	
	class LinkedList{
		private Node head;
		private Node tail;
		
		public LinkedList(){
			this.head = new Node("head");
			tail = head;
		}
		
		public Node head(){
			return head;
		}
		public void add(Node node){
			tail.next = node;
			tail = node;
		}
		
	}
	
	public static void main(String args[]){
		LinkedList linkedList = new LinkedList();
//		LinkedList head = ;
		reverseListIteratively();
	}
	
		public reverseListIteratively (Node head)
		{
		if (head == null || head.next == null)
		return;  //empty or just one node in list

		Node Second = head.next;

		//store third node before we change 
		Node Third = Second.next;  

		//Second's next pointer
		Second.next = head;  //second now points to head
		head.next = null;  //change head pointer to NULL

		//only two nodes, which we already reversed
		if (Third == null)
		return;  

		Node CurrentNode = Third;

		Node PreviousNode = Second;

		while (CurrentNode != null)
		{ 
		Node NextNode = CurrentNode.next;

		CurrentNode.next = PreviousNode;

		/*  repeat the process, but have to reset
		     the PreviousNode and CurrentNode
		*/

		PreviousNode = CurrentNode;
		CurrentNode = NextNode;  
		}

		head  = PreviousNode; //reset the head node
		}

}