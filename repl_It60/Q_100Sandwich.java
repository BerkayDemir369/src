package repl_It60;

import java.util.Scanner;

public class Q_100Sandwich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A sandwich is two pieces of bread with something in between.
		 Print the string that is between the first and last appearance of "bread" in the given string,
		 or return string "nothing" if there are not two pieces of bread.

       Example:
       input: breadjambread
       output: jam*/
		 Scanner scan = new Scanner(System.in);
	     String str = scan.next();
	     
	     if(str.contains("bread")) {
	    	 int firstIndex = str.indexOf("bread");
	    	 int lastIndex= str.lastIndexOf("bread");
	    	 
	    	 if(firstIndex==lastIndex) {
	    		 System.out.println("nothing");
	    	 }else {
	    		 System.out.println(str.substring(firstIndex+5,lastIndex));
	    	 }
	     }else {
	    	 System.out.println("nothing");
	     }
	}

}
