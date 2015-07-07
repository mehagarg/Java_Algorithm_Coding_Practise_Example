import java.util.HashSet;


public class findUniqueChar {
	
	public static void main(String[] args){
		String testString = "tesg";
		System.out.println(ifUniqueChar(testString));
	}
	
	public static boolean ifUniqueChar(String a){
		HashSet<Character> unique = new HashSet<Character>();
		for(int i=0; i<a.length(); i++){
			unique.add(a.charAt(i));
		}
		if(unique.size() != a.length()){
			return false;
		}
		
		return true;
	}

}
