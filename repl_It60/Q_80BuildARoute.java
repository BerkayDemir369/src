package repl_It60;

import java.util.Scanner;

public class Q_80BuildARoute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner scan = new Scanner(System.in);
	    String start = scan.next();
	    String end = scan.next();
	    String s1="A";
	    String s2="B";
	    String s3="C";
	    String s4="D";
	    if(start.equals(end)) {
	    	System.out.println( start + " found");
	    }else if(start.equals(s1) && end.equals(s2)) {
	    	System.out.println("right: "+ s2 + " found");
	    }else if(start.equals(s1) && end.equals(s3)) {
	    	System.out.println("right" + " >" + " down: " +  s3 + " found");
	    }else if(start.equals(s1) && end.equals(s4)) {
	    	System.out.println("right" + " >" + " down" + " >" + " left: " +  s4 + " found");
	    }
	    
	    else if(start.equals(s2) && end.equals(s1)) {
		    	System.out.println( "down" + " >" + " left" +" >" + " up: " +s1 + " found");
	   }else if(start.equals(s2) && end.equals(s3)) {
	    	System.out.println( "down: " + s3 + " found");
	    }else if(start.equals(s2) && end.equals(s4)) {
	    	System.out.println("down" + " >" + " left: " +  s4 + " found");
	    	
	    	
	    }else if(start.equals(s3) && end.equals(s4)) {
	    	System.out.println( "left: " +  s4 + " found");
	    }else if(start.equals(s3) && end.equals(s1)) {
		    	System.out.println( "left" + " >" + " up: " +s1 + " found");
		    
       }else if(start.equals(s3) && end.equals(s2)) {
		    	System.out.println( "left" + " >" +  " up" + " >" + " right: " +s2 + " found");
		    
	    }else if(start.equals(s4) && end.equals(s1)) {
	    	System.out.println( "up: " +s1 + " found");
	    }else if(start.equals(s4) && end.equals(s2)) {
	    	System.out.println( "up"  + " >" + " right: " +s2 + " found");
	    }else if(start.equals(s4) && end.equals(s3)) {
	    	System.out.println( "up"  + " >" + " right" +" >" + " down: " + s3 + " found");
	    }
	}

}
