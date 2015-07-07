package simpleCoding_algo;

public class MaskingProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class Result{
		public int hit;
		public int pseudoHit;
	}
	
	public static Result estimate(String guess, String solution){
		Result res = new Result();
		for(int i=0; i<4; i++){
			if(guess.charAt(i) == solution.charAt(i)){
				res.hit++;
			}
			else if()
		}
	}

}
