
public class BitManipulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		updateBits();

	}
	
	public static void updateBits(){
		int max = ~0;
		int j = 6;
		int i = 2;
		int N = 15;
		int M = 5;
		System.out.println("max = " + max);
		
		int left = max - ((1<<j) - 1);
		System.out.println("left = " + left);
		
		int right = ((1<<i) - 1);
		System.out.println("right = " + right);
		
		int mask = left | right;
		System.out.println("mask = " + mask);
		
		int x = (N & mask);
		System.out.println("x = " + x);
		
		int y = (M << i);
		
		System.out.println("y = " + y);
		
		System.out.println("output = " + (x|y));
		
	}

}
