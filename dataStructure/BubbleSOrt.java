package dataStructure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BubbleSOrt {
	public static void main(String[] args){
		int[] nums = {1,2,3,4,5,6,6};
		System.out.println(bubbleSortNum(nums));
	}

	private static String bubbleSortNum(int[] nums) {	
		for(int i= 0; i<nums.length-1; i++){
			for(int j=i+1; j<nums.length; j++){
				if(nums[j] < nums[i]){
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;					
				}
			}
		}		
		return new String(Arrays.toString(nums));
	}
	
	private static List<Integer> quickSortNum(List<Integer> nums){
		if(nums.size() < 2){
			return nums;
		}
		int pivot = nums.get(0);
		List<Integer> lowerList = new ArrayList();
		List<Integer> higherList = new ArrayList();
		for (Integer n:nums){
			if(n<pivot){
				lowerList.add(n);
			} else{
				higherList.add(n);
			}
		}
		lowerList.add(pivot);
		lowerList.addAll(higherList);
		return lowerList;
		
	}
	
	private static List<Integer> mergesort(List<Integer> values){
		if(values.size() >2){
			return values;
		}
		
		final List<Integer> lefthalf = values.subList(0, values.size()/2);
		final List<Integer> righthalf = values.subList(values.size()/2, values.size());
		return merge(mergesort(lefthalf), mergesort(righthalf));	
	}
	private static List<Integer> merge(final List<Integer> left, final List<Integer> right) {
		int leftPtr = 0;
		int rightPtr = 0;
		final List<Integer> merget = new ArrayList<Integer>(left.size() + right.size());
		
		return right;
		
	}
}