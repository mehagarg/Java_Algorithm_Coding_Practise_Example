
public class replaceStringwith20 {
	public static void main(String[] args){
		String a1 = "I am";
		System.out.println(replaceString(a1));
	}
	
	public static String replaceString(String a){
		char[] arrayString = a.toCharArray();
		int spaceCount=0;
		
		for(int i=0; i<arrayString.length; i++){
			if(arrayString[i] == ' '){
				spaceCount++;
			}		
		}
		
		char[] newArray = new char[arrayString.length + 2*spaceCount];
		int j=newArray.length;
		
			for(int i=arrayString.length-1; i>=0; i--){
				if(arrayString[i] == ' '){
					newArray[j-1] = '0';
					newArray[j-2] = '2';
					newArray[j-3] = '%';
					j=j-3;
				}
				else{
					newArray[j-1] = arrayString[i];
					j--;
				}		
		
		}
		
		return new String(newArray);
	}

}
