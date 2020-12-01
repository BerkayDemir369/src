package repl_it3;

import java.util.Scanner;

public class Q_87ZombieAttack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		    int inhabitants = scan.nextInt();
		    int result=0;
		    int day=0 ;		    
		    do {
		    	    if(inhabitants>0) {
		    	    	
		    	    
		    		System.out.println("Day " + day + " ["+ inhabitants +"]");
		    		result=inhabitants/2;
		    		inhabitants=result;
		    		day++;
		    	    }else if(inhabitants==0) {
		    	    	
		    	    }
		    	
		    }while(result>0);
		    System.out.println("---- EXTINCT ----");
	}

}
