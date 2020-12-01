package practice;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* * String -- Frequency of Characters Write a return method that can find the
		 * frequency of characters
		 * 
		 * -->: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
		System.out.println(frequencyOfChars("AAABBCDD"));
	}
     public static String frequencyOfChars(String str) {
	String unique="";
	
	
	int c=1;
	for(int i=0 ; i<str.length() ; i++) {
		if(str.charAt(i)==((i+1)==str.length()?str.length()-1 :str.charAt(i+1))) {
			c++;
		}else {
			unique += str.charAt(i) + "" + c;
			c=1;
		}
	}
	
	
	
	return unique;
}
}
