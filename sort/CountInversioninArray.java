package sort;

public class CountInversioninArray {
	
	public static void main(String[] args){
		int a[] = {2,4,1,3,5};
		//System.out.println(getInvCountBruteForce(a));
		
		System.out.println(countInversionsDivConqer(a));
	}
	
	// If array is sorted, inversion = 0;
	// For above: (4,1) (4,3) (2,1)
	public static int getInvCountBruteForce(int[] a){
		int invCount = 0;
		for(int i=0; i<a.length-1; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] > a[j]){
					invCount++;
				}
			}
		}
		return invCount;
	}
	
	// By Divide and Conquer way:
	public static int countInversionsDivConqer(int[] a){
		return mergeSort(a, 0, a.length);
	}
	
	private static int mergeSort(int[] a, int low, int high){
		if(low == high-1) return 0;
		int mid = (low+high)/2;
		return mergeSort(a, low, mid) +  mergeSort(a, mid, high) + merge(a, low, mid, high);
	}
	
	private static int merge (int[] a, int low, int mid, int high) {
        int count = 0;
        int[] temp = new int[a.length];

       for (int i = low, lb = low, hb = mid; i < high; i++) {

            if (hb >= high || lb < mid && a[lb] <= a[hb]) {
                temp[i]  = a[lb++];
            } else {
                count = count + (mid - lb); 
                temp[i]  = a[hb++];
            } 
       }

       System.arraycopy(temp, low, a, low, high - low);

       return count;
    }

}
