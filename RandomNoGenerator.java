import java.util.Random;


public class RandomNoGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int x = 0;
		for(int i=0; i<10; i++)
		{
			System.out.println(1+r.nextInt(3)+r.nextInt(5));
		}

}}
