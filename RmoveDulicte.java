import java.util.Arrays;
import java.util.HashSet;


public class RmoveDulicte {
	public static void main(String[] args){
		String a = "aaaaabbbb";
//		System.out.println(removeDupsNoSort(a));
		System.out.println(removeUsingSet(a));
	}
	/**
     * Removes duplicate characters from input string.
     * This function first sorts the input string then removes dups by comparing adjacent characters
     * In place sorting. No additional buffer.
     * Sort is O(n logn). Then the function loops through each character. So O(n logn) + O(n) time 
     * @param str
     * @return
     */
	
	public static String removeUsingSet(String s){
		char[] c = s.toCharArray();
		HashSet<Character> val = new HashSet<Character>();
		
		for(char c1:c){
			val.add(c1);
		}
		return new String(val.toString());
	}
    public static String removeDups(String str){
        
        if(str == null || str.length() == 1){
            return str;
        }
        char[] input = str.toCharArray();
        Arrays.sort(input);
        int current = 0;
        int next = 1;
        
        while(true){
            while(next<=input.length-1 && input[current] == input[next]){   
                next++;
            }
            if(next >= input.length){
                break;
            }
            input[++current] = input[next++];
        }
        return new String(input,0,current+1);
    }


    /**
     * Removes dups without sorting the input string
     * O(n-square) time
     * @param str
     * @return
     */
    public static String removeDupsNoSort(String str){
        if(str == null || str.length() <= 1){
            return str;
        }
        char[] input = str.toCharArray();
        int i=0;
        for(int j=1;j<input.length;j++){
            if(!isPresent(i,j,input)){
                input[++i] = input[j];
            }
        }
        return new String(input,0,++i);
    }
    
    
    private static boolean isPresent(int end, int j, char[] a){
        for(int i=0;i<=end;i++){
            if(a[i] == a[j])    return true;
        }
        return false;
    }
}
