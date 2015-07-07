import java.util.Scanner;
import java.util.Stack;


public class ReversePolishNotation {
	public static void main(String[] args){
		String[] tokens = new String[] {"2", "1", "+", "3", "*", "4", "/"};
		System.out.println(evalRPN(tokens));			
	}
	
	public static String evalRPN(String[] tokens){
		int returnValue = 0;
		String operators = "+-*/";
		Stack<String> stack = new Stack<String>();
		
		for(String val:tokens){
			if(!operators.contains(val)){
				stack.push(val);
			} 
			else{
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				if(val == "+"){
					stack.push(Integer.toString(a+b));
				}
				if(val == "-"){
					stack.push(Integer.toString(a-b));
				}
				if(val == "*"){
					stack.push(Integer.toString(a*b));
				}
				if(val == "/"){
					stack.push(Integer.toString(a/b));
				}
				
			}
			
		}
		return stack.peek();
		
	}

}
