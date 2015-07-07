package recursion;

public class RecursiveSumOfNaturalNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sum of Natural no. 
		System.out.println(recSum(5));
		System.out.println("=====================================");
		
		// Print array of Integers in Reverse order 
		int[] a= {1,2,3,4};
		int len = a.length-1;
		recPrintArray(a, len);
		
		System.out.println("=====================================");
		
		//Recursively print sum of digits of a given no
		int i = 123;
		System.out.println(sumOfDigit(i));
	}
	
	// Sum of Natural no.
	public static int recSum(int n){
		if(n==1) return 1;
		return recSum(n-1) + n;
	}
	
	// Print array of Integers in Reverse order
	public static void recPrintArray(int[] a, int len ){
		if(len <0){
			return;
		}
		else{
			System.out.println(a[len]);
			recPrintArray(a, len-1);
		}
	}
	
	//Recursively print sum of digits of a given no
	public static int sumOfDigit(int n ){
		int i=0;
		if((n/10) == 0){
			return n;
		}		
			return (sumOfDigit(n/10) + (n%10)); 
	}
	
}
