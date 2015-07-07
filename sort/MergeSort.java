package sort;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args){
		int[] input = {5,8, 4, 6,3,1,2,7};
		int[] sorted = new int[input.length];
		sorted = divide(input);
		for(int i=0; i<input.length; i++){
			System.out.println(sorted[i]);
		}
		
	}

	public static int[] divide(int[] input){
		//this will be the base case, when the array is divided to the last
		// left with either 1 element or 2 element at most
		// this gives us length < 2 (can be either 1 or 2)
		if(input.length < 2){
			return null;
		}
			//Divide the array into 2 
			int[] A = new int[input.length/2];
			int[] B = new int[input.length - A.length];
			
			//Copy the array from input
			System.arraycopy(input, 0, A, 0, A.length);
			System.arraycopy(input, 0, B, 0, B.length);
			
			conquerOrmerge(A, B, input);
			return input;
		}
		
		
	
	
	public static void conquerOrmerge(int[] A, int[] B, int[] sortedArray){
		
		int i=0, j=0;
		int m=0;
		while(i<A.length && j<B.length){
			if(A[i] < B[j]){
				sortedArray[m] = A[i];
				i++;
			} else{
				sortedArray[m] = B[j];
				j++;
			}
			m++;
		}
		
		//copy whats left
	//	System.arraycopy(A, i, sortedArray, m, A.length-i);
		//System.arraycopy(B, j, sortedArray, m, B.length-j);
	}

}
