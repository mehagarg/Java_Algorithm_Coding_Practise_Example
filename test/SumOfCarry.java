package test;

import java.util.Arrays;

public class SumOfCarry {
	public static void main(String[] args){
		int[] a= {1,4,5,6};
		int[] a1 = {1,4,5,9};
		int[] a2 = {1,4,9,9};
		int[] a3 = {1,9,9,9};
		int[] a4 = {9,9,9,9};
		
		
		System.out.println(sumOfCaryII(a));
		System.out.println(sumOfCaryII(a1));
		System.out.println(sumOfCaryII(a2));
		System.out.println(sumOfCaryII(a3));
		System.out.println(sumOfCaryII(a4));
		System.out.println("------------" );
		
		System.out.println(sumOfCary(a));
		System.out.println(sumOfCary(a1));
		System.out.println(sumOfCary(a2));
		System.out.println(sumOfCary(a3));
		System.out.println(sumOfCary(a4));
		
		System.out.println("------------" );
	}
	public static String sumOfCaryII(int[] a){
		int carry = 1;
		for(int i=a.length-1; i>0; i--){
			a[i] = a[i] + carry;
			if(a[i]  % 10 == 0){
				a[i] = 0;
				carry = 1;
			}
			else{
				carry = 0;
			}
		}
		
		return new String(Arrays.toString(a));
	}
	
	public static String sumOfCary(int[] a){
		int carry = 0;
		int n=0;
		for(int i=a.length-1; i>0; i--){
			if(i == a.length -1){
				a[i] = a[i]+1;
				
			}
			n =a[i];
			if(n%10==0){
				carry = 1;
				a[i]=0;
				a[i-1] = a[i-1]+carry;
				carry=0;
			}
		}
		return new String(Arrays.toString(a));
	}
}
