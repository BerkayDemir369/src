package repl_it2;

import java.util.Scanner;

public class Q_72StringNoEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner s = new Scanner(System.in);
		    String txt = s.next();
		    //your code here
		    int lastIndex=txt.length()-1;
		    System.out.println(txt.substring(0,lastIndex));
	}

}
