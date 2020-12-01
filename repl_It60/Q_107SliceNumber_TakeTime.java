package repl_It60;

import java.util.Scanner;

public class Q_107SliceNumber_TakeTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*In this task, you need to slice an integer and print numbers one by one from new line.

         Create a scanner object

          Example # 1
          -Display prompt: Enter your number:
           12345
          -Display prompt: 1
          -Display prompt: 2
          -Display prompt: 3
          -Display prompt: 4
          -Display prompt: 5
           */
		 //DO NOT CHANGE
	    int num, digit1, digit2, digit3, digit4, digit5;
	    //WRITE YOUR CODE HERE
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter your number:");
	    num=scan.nextInt();
	    digit1=num/10000;
	    digit2=(num%10000)/1000;
	    digit3=(num%10000)%1000/100;
	    digit4=(num%10000)%1000%100/10;
	    digit5=(num%10000)%1000%100%10;
	    System.out.println(digit1);
	    System.out.println(digit2);
	    System.out.println(digit3);
	    System.out.println(digit4);
	    System.out.println(digit5);
	}

}
