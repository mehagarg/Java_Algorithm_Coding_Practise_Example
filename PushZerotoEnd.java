
public class PushZerotoEnd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
		
		int[] b = pushZeroesToEndv2(a);
		for(int i=0; i<b.length; i++){
			System.out.println(b[i]);
		}

	}
	
	//with additional space
	public static int[] pushZeroesToEnd(int[] a){
		int len = a.length-1;
		int count = 0;
		int[] b = new int[a.length];
		
		for(int i=0; i<len; i++){
//			System.out.println(a[i]);
			if(a[i] != 0){
				b[count] = a[i];	
//				System.out.println("b[i] = " +b[i]);
				count++;
//				System.out.println("count = " +count);
			}
			
		}
		while(count<=len){
			b[count++] = 0;
		}
		return b;
	}

	// with no additonal space
	public static int[] pushZeroesToEndv2(int[] a){
		int len = a.length-1;
		int count = 0;
	
		for(int i=0; i<len; i++){
			if(a[i] != 0){
				a[count] = a[i];	
				count++;
			}		
		}
		while(count<=len){
			a[count++] = 0;
		}
		return a;
	}
}
