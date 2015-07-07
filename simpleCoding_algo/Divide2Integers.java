package simpleCoding_algo;
//http://www.programcreek.com/2014/05/leetcode-divide-two-integers-java/
//http://yucoding.blogspot.com/2013/01/leetcode-question-28-divide-two-integers.html

//Divide two integers
//
//Divide two integers without using multiplication, division and mod operator.
//
//
//Analysis:
//
//Note that is the dividend < divisor as they all integer and the return value is also integer, the return value would be 0.  (e.g. 3/4=0)
//
//Without using the *, /, and % operator, what we can use is +,-, and <<, >> .
//<< 1 is to multiply 2,e.g. 2<<1  = 4;
//>> 1 is to divide 2 e.g.    8>>1 = 4;
//
//Originally, the divide operation can use - only, but this is time-consuming, especially when the dividend is large and the divisor is small. e.g. 123456789/1.
//
//So, use << to speed up.
//1. Keep  multiply 2 (<<1) to the divisor, until it is greater than the dividend. Store the times of shift operation.
//2. if dividend > divisor, then dividend = dividend - divisor/2(>>1). Until dividend< original divisor. Store the   result.
//3. Output the result.
//
//e.g. 15/3
//
//3*2*2*2=24>15, 
//
//15 - 24/2 = 3 - 12/2/2=0 < 3, end.
//                  res = 4,        res = 4+1,   res=5
//
//Another concern is the negative and positive integer and the range of integer. The pos and neg problem can be solved using abs function and the unsigned type cast. The later one we can use the long long type.

public class Divide2Integers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(15, 3));
		
		System.out.println(divide(-15, 3));
		
		System.out.println(divide(11, 3));
		

	}
	public static int divide(int dividend, int divisor) {
	    //handle special cases
	    if(divisor==0) return Integer.MAX_VALUE;
	    if(divisor==-1 && dividend == Integer.MIN_VALUE)
	        return Integer.MAX_VALUE;
	 
	    //get positive values
	    long pDividend = Math.abs((long)dividend);
	    long pDivisor = Math.abs((long)divisor);
	 
	    int result = 0;
	    while(pDividend>=pDivisor){
	        //calculate number of left shifts
	        int numShift = 0;    
	        while(pDividend>=(pDivisor<<numShift)){
	            numShift++;
	        }
	 
	        //dividend minus the largest shifted divisor
	        result += 1<<(numShift-1);
	        pDividend -= (pDivisor<<(numShift-1));
	    }
	 
	    if((dividend>0 && divisor>0) || (dividend<0 && divisor<0)){
	        return result;
	    }else{
	        return -result;
	    }
	}

}
