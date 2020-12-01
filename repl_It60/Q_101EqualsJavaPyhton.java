package repl_It60;

import java.util.Scanner;

public class Q_101EqualsJavaPyhton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*
      * Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
       Example:
       input: We study java not python
       output: true
          */
		 Scanner scan = new Scanner(System.in);
		 String sentence = scan.nextLine();
		 
		 int charCount=sentence.length();
		 int tcharCount=4;
		 int javaCNT=0;
		 int pythonCNT=0;
		 
		 for(int i=0; i<= charCount-4 ; i++) {
			 
			 if(sentence.substring(i,i+tcharCount).equals("java")) {
				 javaCNT++;
			 }
		 }
		 tcharCount=6;
		 for(int i=0; i<= charCount-6 ; i++) {
			 
			 if(sentence.substring(i,i+tcharCount).equals("python")) {
				 pythonCNT++;
			 }
		 }
		 System.out.println(javaCNT == pythonCNT);
	}

}
