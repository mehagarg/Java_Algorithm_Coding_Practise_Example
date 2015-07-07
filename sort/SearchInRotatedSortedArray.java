package sort;

public class SearchInRotatedSortedArray {
	public static void main(String[] args){
		int a[] = {4,5,6,7,0,1,2};
		System.out.println(search1(a, 7));
		
	}
	
	public  static int search1(int[] A, int target) {
        int left = 0;
        int right = A.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (A[mid] == target)
                return mid;
            if (A[left] <= A[mid]) {
                if (target >= A[left] && target <= A[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            } else {
                if (target >= A[mid] && target <= A[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return -1;
    }
	
//	public static int search(int[] a, int x){
//		int left = 0;
//		int right = a.length-1;
//		
//		while(left <= right){
//			int mid = left + right / 2;
//			if(x == a[mid]){
//				return mid;
//			}
//		
//			if(a[left] <= a[mid]){
//				if(x >= a[left] && x <= a[mid]){
//					right = mid -1;
//			} else{
//				left = mid + 1;
//				}
//			} else{
//				if(x >= a[mid] && x<=a[right]){
//					left = mid+1;
//				} else{
//					right = mid - 1;
//				}
//			}
//		}
//		
//		return -1;
//	}
}
