package practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(palindrome("noon"));
		
	}
	public static boolean palindrome(String check) {
		String reverse="";
		for(int x=check.length()-1 ; x>=0 ; x--) {
			reverse += check.substring(x,x+1);  //check.charAt(x) works
		
		}
		return check.replace(" ","").equalsIgnoreCase(reverse.replace(" ",""));
		
	}

}
