package repl_It60;

import java.util.Scanner;

public class Q_60TernanryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		    System.out.println("Enter number:");
				int x = scan.nextInt();
				//WRITE YOUT CODE HERE
				int result;
				result=( x>=5) ? x:-x;
				System.out.println(result);
	}

}
