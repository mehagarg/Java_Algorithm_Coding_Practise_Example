package dataStructure;
import java.util.Scanner;


public class BubbleRotateArraySteps {
	public static void main(String[] args){
		int[] nums = {1,2,3,4,5,6,7};
		int steps=3;
		for(int i=0; i<steps; i++){
			for(int j = nums.length-1; j>0; j--){
				
				int temp = nums[j];
				System.out.println(temp);
				nums[j] = nums[j-1];
				System.out.println(nums[j]);
				nums[j-1] = temp;
				System.out.println("i = " + i + "j = " + j + "nums[j] = " + nums[j-1]);
			}
		}		
		
		for(int i=0; i<nums.length; i++){
			System.out.println(nums[i]);
		}
		// big 0 is n, space and time both "n"
				
	}

}
