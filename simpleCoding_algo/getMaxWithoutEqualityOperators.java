package simpleCoding_algo;

public class getMaxWithoutEqualityOperators {

	/**
	 * LetÕs try to solve this by Òre-wordingÓ the problem. We will re-word the problem until we get something that has removed all if statements.
Rewording 1: If a > b, return a; else, return b.
Rewording 2: If (a - b) is negative, return b; else, return a.
Rewording 3: If (a - b) is negative, let k = 1; else, let k = 0. Return a - k * (a - b). 
Rewording 4: Let c = a - b. Let k = the most significant bit of c. Return a - k * c.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getMaxWithoutEqualityOperators(5, 10);
	}
	public static void getMaxWithoutEqualityOperators(int a, int b){
		int c = a - b; // here if a < b, c is -ve no. and -ve no. are represented as -2 raise to 31
		int k = (c>>31) & 0x1; //Sign and Magnitude works by changing the most significant bit (MSB - the first digit) 
								//to a 1 if the number is negative, and reduce the number by one, for example:
								//0000 0010 (2)
								//will become...
								//1000 0010 (-2)
		int max = a-k*c;
		
		System.out.println(max);
	}

}
