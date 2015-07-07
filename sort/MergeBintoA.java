package sort;

import java.util.Arrays;

public class MergeBintoA {
	
	public static void main(String[] args){
		int[] a = new int[10];
		
		for(int i=0; i<6; i++){
			a[i] = i+1;
		}
		System.out.println(Arrays.toString(a));

		int[] b = {7, 8, 0,9};
//		merge(a, b, 6, 4);
		System.out.println(merge(a, b,6 , 4));
		
//		System.out.println(Arrays.toString(a));

//		System.out.println(Arrays.toString(b));
	}
	
	public static String merge(int[] a, int[] b, int n, int m){
		//int[] ab = new int[10];
		int k=m+n-1; //total array length of ab
		int i = n-1; // elements in a
		int j = m-1; // elments in b
		
		while(i>=0 && j>=0){
			if(a[i] > b[j]){
				a[k--] = a[i--];
			}
			else{
				a[k--] = b[j--];
			}
		}
		while(j>=0){
			a[k--] = b[j--];
		}
		
		
		
		return Arrays.toString(a);
	}

	

}
