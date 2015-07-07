import java.util.Arrays;


public class ReverseSentence {
	public static void main(String[] args){
		String s ="This is a fox table";
		String s1 = "Sony is going to introduce Internet TV soon";
		
		//reversed String using String Builder
		String newS = new StringBuilder(s).reverse().toString();
		System.out.println(newS);
		

		System.out.println("----------------------");
		System.out.println(s);
		System.out.println(reverseSent(s));
		
		System.out.println(s1);
		System.out.println(reverseSent(s1));
		
		
		System.out.println("----------------------");
		System.out.println(s);
		System.out.println(reverseAnotherway(s));
		
		System.out.println(s1);
		System.out.println(reverseAnotherway(s1));
		
		System.out.println("----------------------");
		System.out.println(s);
		System.out.println(reverseRecursively(s));
		
		System.out.println(s1);
		System.out.println(reverseRecursively(s1));
	}
	
	//How to reverse words in a sentence: for e.g. "this is a fox" => "fox a is this"
	public static String reverseSent(String s){
		String[] s1 = s.split(" ");
		int i,j;
		for(i=0,j=s1.length-1; i<s1.length/2; i++,j--){
			String temp = s1[i];
			s1[i] = s1[j];
			s1[j] = temp;
		}	
		
		StringBuilder sb = new StringBuilder();
		
		for(int k=0; k<s1.length; k++){
			sb.append(s1[k] + " ");
		}
		return sb.toString();
	}
	//How to reverse String in Java using Iteration and Recursion => "soon enough" => "hguone noos"
	public static String reverseAnotherway(String s){
		StringBuilder sb = new StringBuilder();
		char[] a1= s.toCharArray();
		System.out.println(a1.length);
		for(int i=a1.length-1; i>=0; i--){
			sb.append(a1[i]);
			System.out.println(sb);
		}
		
		return sb.toString();
	}

	//How to reverse String in Java using Iteration and Recursion => "soon enough" => "hguone noos"
	public static String reverseRecursively(String s){
		if(s.length() <2){
			return s;
		}
		String newString = reverseRecursively(s.substring(1)) + s.charAt(0);
		System.out.println(newString);
		return newString;
	}
}
