package repl_it_Array;

import java.util.Scanner;
import java.util.Spliterator;

public class Q153_Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
	    String s = inp.next();
	    person(s) ;
	  }
	  
	   public static void person(String info) 
		{
		
			//your code here
			
		String[] s2= info.split(",");
		System.out.println("person name: " + s2[0] + " last name: " + s2[1] + " age: " + s2[2]);
	}

}
