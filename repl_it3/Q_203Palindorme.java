package repl_it3;

public class Q_203Palindorme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Palindrome is a word, phrase, or sequence that reads the same backward as forward, e.g., madam or nurses run.

        So method isPalindrome checks that and returns true if check is palindrome and false if it is not.

        - make your conditions case insensitive.  ex: Civic and civic are both palindromes
        - make your conditions space insensitive.  Race car is a palindrome even though there is space in between.

           Examples:

           isPalindrome("Noon") ==> true*/
		
		isPalindrome("noon");
	}

	public static boolean isPalindrome(String check) {
	    
		String reverse="";
		for(int i=check.length()-1 ; i>=0 ; i--){
		reverse += check.charAt(i);
		}
		return check.replace(" ", "").equalsIgnoreCase(reverse.replace(" ",""));
	  }
	
}
