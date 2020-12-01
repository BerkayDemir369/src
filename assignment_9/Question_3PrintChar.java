package assignment_9;

import java.util.Scanner;



public class Question_3PrintChar {

	/*You have a word, do the following:

    1. When word has odd number of characters and:
        - 3 or more characters, print middle letter
              oak ==> a
              javav ==> v
        - Single character, print that character 3 times
             # ==> ###
             q ==> qqq

    2. When word has even number of characters and:
        - 4 or more characters, print middle 2
            java ==> av
            apples ==> pl
            #$%^&* ==> %^
        - 2 characters, print those 2 characters twice
           @@ ==>@@@@
           $$ ==>$$$$
           hi ==> hihi
           
           */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter a word: ");
       String word=scan.next();
       if(word.length()>=3 && word.length()%2==1) {
    	   System.out.println(word.charAt(word.length()/2));
       
       }else if(word.length()==1) {
    	   System.out.print(word.charAt(0));
    	   System.out.print(word.charAt(0));
    	   System.out.print(word.charAt(0));
       }
       if(word.length()>=4 && word.length()%2==0) {
    	   System.out.print(word.charAt(word.length()/2-1));
    	   System.out.print(word.charAt(word.length()/2));
       
       }else if(word.length()==2) {
    	  String repeated=word.repeat(2);
    	  repeated.equals(word);
    	  System.out.println(repeated);
    	  
       }
	}

}
