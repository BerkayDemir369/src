package lab_2;

import java.util.Scanner;

public class Q_3Positive_UpToNumberEntered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a positive nonzero value: ");
		int num=scan.nextInt();
		if(num>0) {
			for(int i=1 ; i<=num ; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
	
		}else {
			System.out.println("Invalid number: ");
		}
	}

}
