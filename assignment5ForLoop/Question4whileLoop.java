package assignment5ForLoop;

import java.util.Scanner;

public class Question4whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		while(num*10<100) {
			System.out.print(num + ",");
			num++;
		}
	}

}
