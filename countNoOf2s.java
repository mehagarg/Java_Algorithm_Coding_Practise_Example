
public class countNoOf2s {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		countNoOfTwoinN(n);

	}
	public static int countNoOfTwoinN(int n){
		int count = 0;
		for(int i=1; i<n; i++){
			if(i%2 == 0){
//				System.out.println(i%2);
				count++;
			}
		}
		System.out.println(count);
		return count;
	}

}
