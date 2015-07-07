package test;

public class SwapInPlaceWOtemp_variable {
	
	public static void main(String args[]){		
		swap(5,9);
		swap1(5,9);
	}
	
	public static void swap(int a, int b){
		a = b-a;
		b = b-a;
		a = a+b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	public static void swap1(int a, int b){
		System.out.println(a^b);
		a = a^b;
		System.out.println(a^b);
		b = a^b;
		a = a^b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
