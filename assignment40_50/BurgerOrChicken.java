package assignment40_50;

import java.util.Scanner;

public class BurgerOrChicken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
	    
	    
	    String in = s.next();
	    
	    //your code here
	    if(in.equals("berger") || in.equals("chicken")  ) {
	    	System.out.println("10.0");
	    }else if(in.equals("soda")) {
	    	System.out.println("2.0");
	    }
	}

}
