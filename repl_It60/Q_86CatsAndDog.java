package repl_It60;

import java.awt.geom.CubicCurve2D;
import java.util.Scanner;



public class Q_86CatsAndDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Print true if the string "cat" and "dog" appear the same number of times in the given string word. 
          Example:
          input: catdog
          output: true

          Example:
          input: catcat
          output: false
             */
		Scanner scan = new Scanner(System.in);
	    int countOfCats = 0;
	    int countOfDogs = 0;
	    String word = scan.next();
	    
	    int wordCharCount=word.length();
	    int tCharCount=3;
	    
	    for(int x=0 ; x<= wordCharCount- tCharCount ; x++) {
	    	
	    	String currenttWord=word.substring(x,x+tCharCount);
	    	//System.out.println(currenttWord);
	    	
	    	if(currenttWord.equals("cat")) {
	    		countOfCats++;
	    		//System.out.println("CAT FOUND");
	    	}else if(currenttWord.equals("dog")) {
	    		countOfDogs++;
	    		//System.out.println("DOG FOUND");
	    	}
	    }
	   // System.out.println(countOfCats);
	    //System.out.println(countOfDogs);
	    System.out.println(countOfDogs==countOfCats);
	}

}
