package test;

public class StringToInt {
	public static void main(String[] args){
		System.out.println(stringToInt("12345"));
		System.out.println(stringToInt("-12345"));
	}
	
	public static Integer stringToInt(String s){
		char[] values = s.toCharArray();
		int length = s.length();
		int number = 0;
		int count = 0;
		boolean negative = false;
		if(isNegative(s)){
			count = 1;
			negative = true;
		}
		while(count < length){
			number*=10;
			number+=(s.charAt(count) - '0');
			count++;
		}
		if(negative){
			return -number;
		}
		return number;
	}
	
	public static boolean isNegative(String s){
		boolean isNegative = false;
		if(s.charAt(0)=='-'){
			return true;
		}
		return false; 			
	}

}
