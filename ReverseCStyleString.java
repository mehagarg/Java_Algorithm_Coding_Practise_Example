
public class ReverseCStyleString {
	public static void main(String[] args){
		String a = "abcd  ";
		
		System.out.println(reverseCStyleString(a));
	}
	
	public static String reverseCStyleString(String a){
		char[] charArray = a.toCharArray();
		char[] newArray = new char[a.length()];
		int i,j, n = charArray.length;

		for(i=01; i<n ; i++){			
				newArray[i] = charArray[n-i-1];
		}
		return new String( newArray);
	}

}
