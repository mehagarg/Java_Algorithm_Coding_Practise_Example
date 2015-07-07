
public class ArmstrongNumber {
	public static void main(String[] args){
		Integer no = 153;
		Integer nextNO = 371;
		Integer newNo = 9474;
		Integer n1 = 8208;
		Integer falseNo = 233;
		System.out.println(checkArm(no));
		System.out.println("============");
		System.out.println(checkArm(nextNO));
		System.out.println("============");
		System.out.println(checkArm(newNo));
		System.out.println("============");
		System.out.println(checkArm(falseNo));
		System.out.println("============");
		System.out.println(checkArm(n1));
	}
	
	public static boolean checkArm(Integer no){
		String no1 = Integer.toString(no);
		int i = 0;
		int originalno = no;
		int remainder, result = 0;
		while(i<no1.length()){
			remainder = no%10;
			result = result + power(remainder, no1.length());
			no = no/10;
			i++;
		}
		if(originalno == result)
			return true;
		else 
			return false;
	}
	
	public static int power(int no, int times){
		int i;
		int result=1;
		for(i=0; i<times; i++){
			result = result*no;
		}
		return result;
	}

}
