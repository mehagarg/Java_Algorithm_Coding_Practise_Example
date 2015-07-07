
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}
	
	//5*4*3*2*1
	
	public static int factorial(int n){
		if(n==0){
			return 1;
		}
		return n* factorial(n-1);
	}
}
