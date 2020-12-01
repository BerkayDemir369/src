package repl_it2;

import java.util.Scanner;

public class QuestionFindAuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    //WRITE YOUR CODE HERE 
		System.out.println("Enter full name:");
	    String name=scan.nextLine();
	     switch(name.toLowerCase()){
	       case"alan wake":
	          System.out.println("User found!");
	          break;
	          case "max payne":
	          System.out.println("User found!");
	       break;
	       default:
	        System.out.println("User not found!");
	       break;
	        }
				
	
		
	}

}
