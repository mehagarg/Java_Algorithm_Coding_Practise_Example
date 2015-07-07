import java.util.HashMap;

import javax.sql.rowset.CachedRowSet;


public class FibonacciNo {
	public static void main(String[] args){
		int number = 10;
		for(int i=1; i<=number; i++){
			System.out.print(fibonacciRecursion(i) + " ");
		}
//		System.out.println(" ");
//		System.out.println( "----------------------------- ");
//		for(int i=1; i<=number; i++){
//			System.out.print(fibonacciIterative(i) + " ");
//		}
		System.out.println(" ");
		System.out.println( "----------------------------- ");
		System.out.println( "----------------------------- ");
		System.out.println( "----------------------------- ");
		System.out.println( "----------------------------- ");
		
		for(int i=1; i<=number; i++){
			System.out.print(fibonacciRecursion(i) + " ");
		}
		
	}
	
	public static int fibonacciRecursion(int number){
		if(number == 1 || number ==2){
			return 1;
		}
		return fibonacciRecursion(number-1) + fibonacciRecursion(number-2);
		
	}
	
	public static int fibonacciIterative(int number){
		if(number ==1 || number==2){
			return 1;
		}
		int fibo1 = 1, fibo2=1, fibon=1;
		for(int i=3; i<=number; i++){
			fibon = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibon;
		}
		return fibon;
	}
	
	public static int fibonacciMemoization(int number){
		HashMap< Integer, Integer> cache = new HashMap<Integer, Integer>();
		Integer fibonacci = cache.get(number);
		if(fibonacci != null){
			return fibonacci;
		}
		fibonacci = fibonacciRecursion(number);
		cache.put(number, fibonacci);
		return fibonacci;
	}

}
