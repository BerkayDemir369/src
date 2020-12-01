package practice;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* * String --> sum of digits in a string Write a method that can return the sum of
		 * the digits in a string
		Write a code to prove that strings are immutable in java?*/
		String a="sa6ds5a9d45as";
		
		System.out.println(getSumOfDigit(a));
	}

	public static int getSumOfDigit(String str) {
		int sum=0;
		for(int i=0 ; i<str.length() ; i++) {
			if(Character.isDigit(str.charAt(i))){
				String b=str.substring(i,i+1);
				sum += Integer.parseInt(b);
			}
		}
		
		return sum;
	}
}
