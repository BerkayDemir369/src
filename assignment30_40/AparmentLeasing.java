package assignment30_40;
import java.util.*;
public class AparmentLeasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Welcome to Cybertek Apartments!");
	    System.out.println("Number of bedrooms you are interested:");
	    int numberOfBedrooms = scan.nextInt();
	    int startingPrice=0;
	    
	    //WRITE YOUR CODE HERE
switch(numberOfBedrooms) {
	    
	    case 1:
	    System.out.println( "One Bedroom Selected");
	    System.out.println("Starting Price: 1100");
	    
	        break;
	    case 2:
		    System.out.println("Two Bedroom Selected");
		    System.out.println("Starting Price: 1850");
		    
		    
		    break;
	    case 3:
		    System.out.println("Three Bedroom Selected");
		    System.out.println("Starting Price: 2550");
		    
		    break;
		    default:
		    	System.out.println("No such Bedrooms available");
		    	System.out.println("Starting Price: " + startingPrice);
	    }
	    
	}

}
