
public class FindMin {
	
	public static void main(String[] args){
		int[] a= {3, 4 ,5 ,6, 7, 1, 2};
		System.out.println(findMin(a));
	}
	
	public static int findMin(int[] a){
		int currMin = a[0];
		for(int i=0; i<a.length; i++){
			if(currMin > a[i]){
				currMin = a[i];
			}
		}
		return currMin;
		
	}
}
