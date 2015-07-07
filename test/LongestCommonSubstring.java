package test;

public class LongestCommonSubstring {
	public static void main(String[] args){
//		System.out.println(lcs("headache", "penadactly"));
//		System.out.println(lcs("This is a common thing", "This is a common nooo thing"));
		System.out.println(lcs("abc", "dbc"));
	}
	
	public static String lcs(String str1, String str2){
		int l1 = str1.length();
		int l2 = str2.length();
		
		int[][] arr = new int[l1+1][l2+1];
		int len = 0, pos = -1;
		
		for(int x=1; x<l1+1; x++){
			System.out.println("x = " + x);
			for(int y=1; y<l2+1; y++){
				
				System.out.println("y = " + y);
				if(str1.charAt(x-1) == str2.charAt(y-1)){
					arr[x][y] = arr[x-1][y-1]+1;
					System.out.println("x == "+ x + "y=" + y + "in if condition ==> arr[x][y] = " +arr[x][y] + " ___ arr[x-1][y-1]+1 = " + arr[x-1][y-1]+1);
					if(arr[x][y] > len){
						len = arr[x][y];
						System.out.println("len = " + len);
						pos = x;
						System.out.println("pos = " + pos);
					}
				} 
				else{
					arr[x][y] = 0;
					System.out.println("in else condition ==> arr[x][y] = " +arr[x][y]);
				}
			}
		}
		return str1.substring(pos-len, pos);
	}

}
