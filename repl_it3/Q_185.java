package repl_it3;

public class Q_185 {

	
	/*the method gets two strings and return the longest one

     biggerS("apple","orange") ==> "orange"
        */
	 public static String biggerS(String a ,String b)
	  {
	   if(a.length() > b.length()) {
		   return a ;
	   }else {
		   return b ;
	   }
	  }
}
