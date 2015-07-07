import java.util.Arrays;


public class removeChar {
	public static void main(String args[]){
		String s = "abc";
		String s1 = "aaaa";
		String s2 = "ababababa";
		System.out.println(remCharImproved(s, 'b'));
		System.out.println(remCharImproved(s1, 'a'));
		System.out.println(remCharImproved(s2, 'a'));
		
		System.out.println(removeCharRecursive(s, 'b'));
		System.out.println(removeCharRecursive(s1, 'a'));
		System.out.println(removeCharRecursive(s2, 'a'));
	}
	
	public static String remChar(String s, char a){
		char[] c = s.toCharArray();
		char[] copyNew = new char[c.length];
		char charToRemove = a;
		int j=0;
		for(int i=0; i<c.length && j<c.length; i++, j++){
			if(c[i] == charToRemove){
				copyNew[j] = ' ';
			}
			else{
				copyNew[j] = c[i];
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<copyNew.length; i++){
			sb.append(copyNew[i]);
		}
		
		return sb.toString();
	}

	public static String remCharImproved(String s, char a){
		char[] c = s.toCharArray();
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<c.length ; i++){
			if(c[i] != a){
				sb.append(c[i]);
			}
		}
		return sb.toString();
	}
	
	public static String removeCharRecursive(String s, char a){
		int index = s.indexOf(a);
		if(index == -1){
			return s;
		}
		return removeCharRecursive(s.substring(0, index) + s.substring(index + 1, s.length()), a);
		
	}
}
