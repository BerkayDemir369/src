package lab_2;

import java.util.Scanner;

public class Q_4_Males_Fameles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of males:");
		double males= sc.nextInt();
		System.out.print("Enter number of females:");
		double females= sc.nextInt();
		double sum=males+females;
		System.out.println("Percentage of males is: %"+(int)((males/sum)*100));
		System.out.println("Percentage of females is: %"+(int)((females/sum)*100));
		
	}

}
