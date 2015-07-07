import java.util.Scanner;


public class RotateArraySteps {
	public static void main(String[] args){
		int[] nums = {1,2,3,4,5,6,7};
		int steps=3;
		int[] newArray = new int[nums.length];
		
		for(int i=0; i<steps; i++){
			newArray[i] = nums[nums.length - steps + i]; 
			System.out.println(newArray[i]);
		}
		//System.out.println(newArray[i]);
		System.out.println("----------------");
		int j=0;
		for(int i=steps; i<nums.length ; i++){
			newArray[i] = nums[j];
			j++;			
		}
		
		System.arraycopy(newArray, 0, nums, 0, nums.length);
		
		for(int i=0; i<nums.length; i++){
			System.out.println(nums[i]);
		}
		// big 0 is n, space and time both "n"
				
	}

}
