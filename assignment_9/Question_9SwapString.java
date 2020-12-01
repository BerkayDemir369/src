package assignment_9;

import java.util.Scanner;

public class Question_9SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*In this task, you need to swap first name with last name in the email.
		 *  If email doesn't contains underscore - do not anything. 

          Example:
          input: mike_tyson@gmail.com
          output: tyson_mike@gmail.com
          
          */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your email: ");
		String email=scan.next();
		

	     if( ! email.contains("_") ) {
		    	System.out.println(email);
		    	
		    }else {
			String firstName,lastName;
			int underscoreIndex ,atSignIndex;
			underscoreIndex=email.indexOf("_");
			atSignIndex  =email.indexOf("@");
			firstName=email.substring(0 ,underscoreIndex);
			lastName=email.substring(underscoreIndex + 1 ,atSignIndex);
			System.out.println(lastName + "_" + firstName + "@gmail.com");
		}
	}

}
