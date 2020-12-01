package repl_It60;

import java.util.Scanner;

public class Q_103PrintTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int j = 1;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		/*
		 * n=5;
              *
              **
              ***
              ****
              ******/
		
			
			
			for(i=1;i<=n;i++) {
				
				for(j=1;j<=i;j++) {
					
					System.out.print("*");
				
				}
				System.out.println();
			}
	}

}
