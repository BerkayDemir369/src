package assignment_9;

import java.util.Scanner;

public class Question_4WordSubs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*You have a word, do the following:

        If the word has odd number of characters and has 5 or more characters, 
        print the middle three characters of the word. Otherwise, print "invalid".

        Sample Output:

        fifteen ==> fte
        apple ==> ppl
        hey ==> invalid
        java ==> invalid
        whatsup ==> ats
        $ ==> invalid*/

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word=scan.next();
		
		if(word.length()%2==1 && word.length()>=5) {
		
			
			System.out.print(word.charAt(word.length()/2-1));
			System.out.print(word.charAt(word.length()/2));
			System.out.print(word.charAt(word.length()/2+1));
			
		}else {
			System.out.println("invalid");
		}
	}

}
