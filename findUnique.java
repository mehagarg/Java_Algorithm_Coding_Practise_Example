
public class findUnique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isUnique("sitaram"));
		

	}
	
public static boolean isUnique(String s){
	boolean[] charset = new boolean[256];
	for(int i=0; i<s.length(); i++){
		int val = s.charAt(i);
		System.out.println(val);
		if(charset[val]) return false;
		charset[val] = true;
	}
	return true;
}

}
