package exercise;

import java.util.ArrayList;

public class Q_193_ArrayCombine {
	
	public static void main(String[] args) {
		
		/*combine two String arrays into one arraylist and return it as a string.

                 for example:

                combineRs(["f","o","o"],[" b","a","r"])
                returns "foo bar"


                combineRs(["1","2","3"],[" 4"])
                returns "1234"*/
		
		String[]x= {"f","o","o"};
		String[]y= {"b","a","r"};
		
		System.out.println(combineRs(x, y));
	}

	 public static String combineRs(String[] r1,String[] r2) 
	  {
	  
	 ArrayList<String> items =new ArrayList<>();
	 
	 for(String each : r1) {
		 items.add(each);
		 
       }
	 for(String each : r2) {
		 items.add(each);
		 
       }
	
	 String result="";
	 for(String eachItem :items) {
		 result += eachItem ;
		 
	 }
	 
	 return result;
	   
	  }
	
}
