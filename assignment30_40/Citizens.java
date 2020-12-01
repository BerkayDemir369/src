package assignment30_40;
import java.util.*;
public class Citizens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		
	    int seniorCitizens=scan.nextInt();
	    int nonSeniorCitizens=scan.nextInt();
	    
	    System.out.println("What is new citizen's age?");
	    int age=scan.nextInt();
	    
	    if(age>=65) {
	    	System.out.println("Senior Citizen");
	    	System.out.println("New seniorCitizens count " + (seniorCitizens+1));
	        System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);
	    }else if(age<65) {
	    	System.out.println("Senior Citizen");
	    	System.out.println("New seniorCitizens count " + seniorCitizens);
	    	System.out.println("New nonSeniorCitizens count " + (nonSeniorCitizens + 1));
	    	
	    }
	    
		
	}

}
