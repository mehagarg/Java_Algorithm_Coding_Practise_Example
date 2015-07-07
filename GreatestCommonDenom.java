
public class GreatestCommonDenom {
	public static void main(String[] args){
//		System.out.println(gcd(50, 100));
//		System.out.println(gcd(144, 180));
//		System.out.println(gcd(210, 343));
		System.out.println(gcd(999, 17));
//		System.out.println(gcd(-0, 17));
		
	}
	
	public static int gcd(int a, int b){
		// if thre is no other no, return a
		if(b == 0) {return a;}
		int remainder = a%b;
		System.out.println(remainder);
		return gcd(b, remainder);
		
	}
}
