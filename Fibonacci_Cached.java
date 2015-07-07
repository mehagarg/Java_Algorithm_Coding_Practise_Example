import java.util.HashMap;

public class Fibonacci_Cached {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 1000; i++) {
			System.out.println(cachedFib(i));
		}
	}

	public static HashMap<Integer, Double> cachedVal = new HashMap<Integer, Double>();

	public static double cachedFib(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("n ,nfa");
		}
		cachedVal.put(0, 0.0);
		cachedVal.put(1, 1.0);
		return recursiveCachedFib(n);

	}

	public static double recursiveCachedFib(int n) {
		if (cachedVal.containsKey(n)) {
			return cachedVal.get(n);
		}
		double value = recursiveCachedFib(n - 1) + recursiveCachedFib(n - 2);
		cachedVal.put(n, value);
		return value;
	}

}
