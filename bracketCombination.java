
public class bracketCombination {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		
//		brackets(s, 0, 0, 2 );
		brackets(s, 0, 0, 5 );

	}
	
	public static void brackets(String output, int open, int close, int pairs){
		if(open == pairs && close == pairs){
			System.out.println(output);
		} else{
			if(open<pairs){
				brackets(output + "(", open+1, close, pairs);
			}
			if(close<open){
				brackets(output + ")", open, close+1, pairs);
			}
		}
	}

}
