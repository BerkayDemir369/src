package exercise;

import java.util.ArrayList;

public class Q_214StringFind {

	 public static String search(ArrayList<String> lst, String target) 
	  {
	   
	    
	   for(String current: lst) {
		   
		   if(current.contains(target)) {
			  return current;
			  
		   }
		   
	   }
		   
		   
	   return "search failed";
	  }//end wineSeller
	  
	  public static void main(String[] args)
	  {
	    
	    ArrayList<String>  arr = new ArrayList<String>();
	    arr.add("2");
	    arr.add("6");
	    arr.add("foo bar");
	    arr.add("abc foo");
	    
	  
	    String find_tst = search(arr,"foo");
	    System.out.print(find_tst);//foo bar
	   
	 
	    
	  }//end main
	}

