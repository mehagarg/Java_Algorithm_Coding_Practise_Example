package dataStructure;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args){
		Stack stack1= new Stack();
		stack1.push(42);
		System.out.println(stack1);
		stack1.push(66);
		System.out.println(stack1);
		stack1.push(99);
		System.out.println(stack1);
		stack1.pop();
		System.out.println(stack1);
		stack1.peek();
		System.out.println(stack1);
	}
}
