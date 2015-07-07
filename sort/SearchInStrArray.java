package sort;

public class SearchInStrArray {
	public static void main(String[] args){
		String[] strArray = [“at”, “”, “”, “”, “ball”, “”, “”, “car”, “”, “”, “dad”, “”, “”];
		search(strArray, "ball");
	}
	
	public static int search(String[] strArray, String s ){
		int left = 0;
		int right = strArray.length -1;
		
		while(left <= right){
			while(left <= right && strArray[right] == ""){
				--right;
			}
			if(right<left){return -1;}
			int mid = left + right / 2;
			while(strArray[mid] ==""){
				++mid;
			}
			int r = strArray[mid].compareTo(s);
			if (r== 0) return mid;
			if(r<0){
				left = mid+1;
			}
			else{
				right = mid -1;	
			}
		}
		return -1;
	}
}
