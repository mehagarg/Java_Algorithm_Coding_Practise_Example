package test;

/**
 * Given a sorted array [0-99]
With input: [1, 5, 45, 86]
Write a function that prints the empty regions, example Output: Ò0,2-4,6-44,46-85,87-99Ó
 * @author meha
 *
 */
public class EmptyRegion_RangeofNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[100];
		for(int i=0; i<100; i++){
			arr[i] = i;
			
		}
		
		int input[] = {1, 5, 45, 86};
//		int input[] = {15, 20, 45, 99};
		emptyRegion(arr, input);

	}
	
	public static void emptyRegion(int[] arr, int[] val){
		int len = val.length;
		int rangelength = arr.length;
		StringBuilder builder = new StringBuilder();
		boolean visited = false, visitedLast = false;

		
		
		for(int i= 0; i<len-1; i++){
			// handle first case
//			val[0] - arr[0] = (15-0) >=0 =>Range is arr[0] - (val[0]-1)	
			if(val[0] - arr[0] >=0 && !visited){
				builder.append(arr[0] + " - " + (val[0] -1));
				visited = true;
			}
			//handle midle case
			if(val[i]<arr[rangelength-1] && val[i]>=arr[0] ){
				
				int x = val[i]+1;
				int y=  val[i+1]-1;
//				builder.append(arr[i]);
				builder.append(",");
				builder.append( x + " - " +y);
			}
			
			
		}
		//handle last case
		// arr[len-1] - val[len-1] > 0 then, range is (val[len-1]+1 to arr[len-1]
		if((arr[rangelength-1] - val[len-1]) >=0  && !visitedLast){
			builder.append(  (val[len-1] + 1) + " - " + arr[rangelength-1] );
			visitedLast = true;
		}
		
		System.out.println(builder);
	}

}
