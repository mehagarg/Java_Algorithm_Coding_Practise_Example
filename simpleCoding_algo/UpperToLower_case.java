package simpleCoding_algo;

public class UpperToLower_case {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(upperToLower("MEHA"));
		System.out.println(lowerToUpper("sitaram"));

	}
	
	public static String upperToLower(String c){
		char aChar = ' ';
		String result = "";
		for(int i=0; i<c.length(); i++){
			aChar = c.charAt(i);
			if(c.charAt(i) >=65 && c.charAt(i) <=90)
				{aChar =(char) (aChar + 32);
				System.out.println(aChar);}
			result = result + aChar;
		}	
		
		return result;
		
	}

	public static String lowerToUpper(String c){
		char aChar = ' ';
		String result = "";
		for(int i=0; i<c.length(); i++){
			aChar = c.charAt(i);
			if(c.charAt(i) >=91 && c.charAt(i) <=125)
				{aChar =(char) (aChar - 32);
				System.out.println(aChar);}
			result = result + aChar;
		}	
		
		return result;
		
	}
}
