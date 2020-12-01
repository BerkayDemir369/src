package practice;

import java.util.Scanner;



public class JavaPyhton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner scan = new Scanner(System.in);
		   String sentence = scan.nextLine();
		   int sentenceCount=sentence.length();
		   int countJava=0;
		   int countPython=0;
		   
	      
	      for(int x=0 ; x<=sentenceCount-4 ; x++) {
	           
	          if(sentence.substring(x,x+4).equals("java")) {
	        	  countJava++;
	          }
	         
	      }
	      
	      
	      for(int x=0; x<=sentenceCount-6;x++) {
	    	 
	    	  if(sentence.substring(x,x+6).equals("python")) {
	    		  countPython++;
	    	  }
	      }
	      System.out.println(countJava == countPython);
	}
}
