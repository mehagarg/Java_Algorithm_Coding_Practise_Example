import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortInt {
	public static void main(String[] args){
//		Object[] numbers = {-3, -7, 1,-5, 2,6};
		Object[] strings = {"z", "x", "y", "abc", "zzz", "zazzy"};
//			System.out.print(sortIntNO(strings));
//			System.out.print(customSorting());
		final  List<Integer> numbers = Arrays.asList(4,7,1,6,3,5,4);
			customSorting(numbers);
	}

	private static String sortIntNO(Object[] strings) {
		//int[] sortNo = new int[numbers.length];
		Arrays.sort(strings);
		return new String(Arrays.toString(strings)); 
	}
	
	public static class  ReverseNumericalOrder implements Comparator<Integer>{
		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o2-o1;
		}
	
	}
	
	
	public static int customSorting(List<Integer> numbers){
		
		Collections.sort(numbers, new ReverseNumericalOrder());
	      for(Integer a: numbers)//printing the sorted list of ages
	         System.out.print(a);
	      return 0;
	   }
	
	}

