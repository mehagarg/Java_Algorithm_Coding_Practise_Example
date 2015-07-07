package simpleCoding_algo;

public class AtoIconversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(atoi(" -123 "));

	}
	
	public static int atoi(String s){
		
		if(s.length()<0 || s==null){
			return 0;
		}
		
		s = s.trim();
		
		char flag = '+';
		
		int i=0;
		if(s.charAt(0) == '-'){
			flag = '-';
			i++;
		} else if(s.charAt(0) == '+'){
			i++;
		}
		
		double result = 0.0;
		
		while(s.length()>i && s.charAt(i)>='0' && s.charAt(i)<='9'){
			result = result * 10 + (s.charAt(i) - '0');
			System.out.println(result);
			i++;
		}
		
		if(flag == '-'){
			result = -result;
		}
		
		if(result > Integer.MAX_VALUE){
			return Integer.MAX_VALUE;
		}
		if(result < Integer.MIN_VALUE){
			return Integer.MIN_VALUE;
		}
		
		return (int) result;
	}

}
