
public class ShuffleDeckOfCard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5};
		shuffle(a);

	}
	
	public static void shuffle(int[] a){
		for(int i=0; i<a.length; i++){
			int index = (int)(Math.random() * (a.length - i)) + i;
			System.out.println("index = " + index);
			int temp = a[i];
			a[i] = a[index];
			a[index] = temp;
			
			System.out.println(a[index]);
			
			
		}
	}

}
