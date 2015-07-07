import java.io.OptionalDataException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Problem : For a given natural number greater than zero return:
    “Fizz” if the number is dividable by 3
    “Buzz” if the number is dividable by 5
    “FizzBuzz” if the number is dividable by 15
    the same number if number is neither divisible by 3 nor 5.

Read more: http://javarevisited.blogspot.com/2015/04/fizzbuzz-solution-in-java-8.html#ixzz3aA8dcuE9
 * 
 */
public class FizzBuzzAlgo {
	public static void main(String[] args){
		//Object[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28, 29, 30};
		int n= 2;
		System.out.println(fizzBuzz1(n));
	}
	public static String fizzBuzz1(int num){
		if(num%15 == 0) return "FizzBuzz";
		else if(num%3 ==0 ) return "Fizz";
		else if(num%5 == 0) return "Buzz";
		return Integer.toString(num);
		
	}
	public static List<String> fizzBuzz(int num){
		final List<String> toReturn = new ArrayList<String>(num);
		for(int i=0; i<num; i++){
			if(i%15 == 0 ){
				toReturn.add("fizzbuzz");
			}
			else if(i%3 == 0){
				toReturn.add("fizz");
			}
			else if(i%5 == 0){
				toReturn.add("buzz");
			} 
			else{
				toReturn.add(Integer.toString(i));
			}
		}
		
		return toReturn;
	}
	
}
