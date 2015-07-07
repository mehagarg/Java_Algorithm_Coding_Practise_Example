
public class MaxFromArray {
	public static void main(String[] args){
		int[] a={6,8,9,12,1,2};
		
		System.out.println(maxInArray(a));
		System.out.println(compareToAll(a));

	}

	public static int maxInArray(int[] a){
		int curMax=a[0];
		
		if(a.length<=0){
			return -1;
		}
		for(int i=0; i<a.length; i++){
			if(a[i] > curMax){
				curMax = a[i];
			}
		}
		return curMax;
	}
	
	public static int compareToAll(int[] a){
		int i, j;
		boolean isMax;
		
		if(a.length <= 0){
			return -1;
		}
		
		for(i=a.length-1; i>0; i--){
			isMax = true;
			for(j=0; j<a.length; j++){
				if(a[j] > a[i]){
					isMax = false;
				}
				if(isMax) break;
			}
			
		}
		return a[i];
	}
}
