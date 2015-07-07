package simpleCoding_algo;

public class ReverseInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverseInt(-123));

	}
	
	public static int reverseInt(int val){
		int result = 0;
		
		boolean isNegative = false;
		
		if(val < 0){
			val = 0 - val;
			isNegative = true;
		}
		
		while(val > 0){
			result = result * 10 + val %10;
			val = val/10;
		}
		
		if(isNegative){
			result = 0 - result;
		}
			
		return result;
	}

}
