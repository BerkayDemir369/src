package repl_It60;

import java.util.Scanner;

public class Q_802_StringNoEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   In this exercise you get a string called txt .

           output txt without its last letter.

           for example:

           txt = "foo"

           output will be:fo
                    
             */
		Scanner s = new Scanner(System.in);
	    String txt = s.next();
	    //your code here
	    System.out.println(txt.substring(0,txt.length()-1));
	}

}
