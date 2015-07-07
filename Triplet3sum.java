import java.util.HashMap;


public class Triplet3sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a= {-2, 8, 2 , -3, 5, 4};
		System.out.println(find3SumtoZero(a));
	}
	
	public static boolean find3SumtoZero(int[] a){
		int result = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<a.length; i++){
			map.put(result-a[i], i);
			System.out.println("result - a[i] = " + (result-a[i]) + "	i =" +i);
		}

		for(int i=1; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				System.out.println("a[i] = " + a[i] + "      a[j] = " + a[j]);
				if(map.containsKey(a[i] + a[j])){
					return true;
				}
			}
		}
		
		
		return false;
	}

}
