package repl_It60;

import java.util.Scanner;

public class Q_92Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*In mathematics, the factorial of a positive integer n, denoted by n!,
		 *  is the product of all positive integers less than or equal to n. 
		 *   Calculate factorial and output result to the console. 
            Example:
            1! = 1 = 1
            2! = 2 x 1 =2
            3! = 3  x 2 x 1 = 6
            4! = 4 x 3 x 2 x 1 = 24
            5! = 5 x 4 x 3 x 2 x 1 = 120
            input: 5
            output: 120*/
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    
	  
        long fact = 1;
        int i = 1;
        while(i<=n)
        {
            fact = fact * i;
            i++;
        }
        System.out.println(fact);
	}

}
