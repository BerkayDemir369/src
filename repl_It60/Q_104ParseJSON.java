package repl_It60;

import java.util.Scanner;

public class Q_104ParseJSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             /*
              In this task, we gonna talk about JSON files. JavaScript Object 
              Notation (JSON)
              -  is a language-independent data format. 
              Write a program that will parse JSON file,
              and print out into the console first name and last name as displayed in the 
              example below.
              In this task, JSON file will be provided as a String variable. 
                 
        Example:
        input:{"id": 1934, "firstName": "James", "lastName": "May", "role": "student-team-member"}
        output:
        First name: James
        Last name: May*/
		
		//*** indesOf(int ch, int fromindex)***
		
		    Scanner scan = new Scanner(System.in);
			String json = scan.nextLine();
			int FirstNameStartingIndex=json.indexOf("firstName")+13;
			int firstNameEndingIndex=json.indexOf("\"",FirstNameStartingIndex);
			System.out.println("First name: " + json.substring(FirstNameStartingIndex,firstNameEndingIndex));
			
			
			int lastNameStartingIndex=json.indexOf("lastName")+12;
			int lastNameEndingIndex= json.indexOf("\"",lastNameStartingIndex);
			
			System.out.println("Last name: " + json.substring(lastNameStartingIndex,lastNameEndingIndex));
			
	}

}
