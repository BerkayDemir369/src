package repl_it_Array;

import java.util.Scanner;

public class Q119_SplitArrayEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Given a String variable email, write code using split method to print email
		 *  id and domain in separate lines.

            Example:
            email -> info@cybertekschool.com
            Print:  
            Email id: info
            Email domain: cybertekschool.com


          If email contains no @ character or multiple @ characters then 
          print invalid email:

            email -> hello-gmail.com
            print:  
            invalid email

           email -> my@fancy@email.com
           print:  
           invalid email
           */
		  Scanner input = new Scanner(System.in);
		    String email = input.nextLine();
		    
		    //Write your code below
		    String[] s=email.split("@");
		    if(s.length==2){
		    	System.out.println("Email id: " + s[0]);
			    System.out.println("Email domain: " + s[1]);
		    }else {
		    	System.out.println("invalid email");
		    }
		    
	}

}
