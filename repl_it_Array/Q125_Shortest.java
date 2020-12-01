package repl_it_Array;

import java.util.Scanner;

public class Q125_Shortest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Write a program that will print the shortest word in the given array str. 

         input: java, cable, red, vivid, remedy, grace
         output: red*/
		 Scanner scan = new Scanner(System.in);
		    String[] str = {scan.next(), scan.next(), scan.next(), 
		                    scan.next(), scan.next(), scan.next()};
		    
		   String shortestWords= str[0];
		   
		   for(String currentWord : str) {
			  if(currentWord.length()<shortestWords.length()) {
				  shortestWords=currentWord;
			  }
		   }
		   System.out.println(shortestWords);
		  
	}

}
