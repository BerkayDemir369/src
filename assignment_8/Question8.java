package assignment_8;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fib();
	}
	public static void fib() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scan.nextInt();
		int i = 1, t1 = 0, t2 = 1;
		
        

        while (i <= n)
        {
        	System.out.print(t1);

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
          
            
            

            i++;
        }
		
        
	}

}
