package simpleCoding_algo;

public class lengthOfLastWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord("hello_world"));
		//lenghtOfLastWordMystyle("hello world");
//		System.out.println(lenghtOfLastWordMystyle("hello world"));

	}
	
	public static int lenghtOfLastWordMystyle(String s){
		String[] strArr = s.split(" ");
		for(int i= strArr.length-1;i>=0; i++){
			System.out.println(strArr[i]);
			return strArr[i].length();
		}
		return 0;
		
		
	}
	
	public static int lengthOfLastWord(String s) { 
	    if(s==null || s.length() == 0)
	        return 0;
	 
	    int result = 0;
	    int len = s.length();
	 
	    boolean flag = false;
	    for(int i=len-1; i>=0; i--){
	        char c = s.charAt(i);
	        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
	            flag = true;
	            result++;
	        }else{
	            if(flag)
	                return result;
	        }
	    }
	 
	    return result;
	}

}
