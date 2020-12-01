package practice;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	/* * String -- Frequency of Characters Write a return method that can find the
		 * frequency of characters
		 * 
		 * -->: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
	
	frequencyOfChars("AAABBCDD");
}
public static String frequencyOfChars(String str) {
	
	int count=0;
	String newWord="";
	
	for(int i=0; i<str.length()-2 ; i++) {
		for(int j=0 ; j<str.length()-1 ; j++) {
			if(str.substring(i,i+1).equals(str.substring(j,j+1))){
				count++;
				newWord =str.substring(i,i+1);
			}
		}
		
		
		if(!newWord.equals(str.substring(i+1,i+2))) {
			System.out.print(newWord + count);
		}
		count=0;
	}
	
	return str;
}
}
