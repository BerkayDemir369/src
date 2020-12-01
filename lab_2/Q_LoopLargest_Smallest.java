package lab_2;

import java.util.Scanner;

public class Q_LoopLargest_Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int largest = 0;

		int anotherNumber = 0;
		System.out.println("Enter your first number: ");
		int num1 = scan.nextInt();
		int smallest = num1;
		System.out.println("Enter your next number: ");
		int num2 = scan.nextInt();
		int num3;
		if (num1 > num2) {
			largest = num1;
			smallest = num2;
			System.out.println("Do you want to enter another number: 0-NO, 1-Yes");
			anotherNumber = scan.nextInt();
			if (anotherNumber == 1) {
				do {

					System.out.println("Enter your next number: ");
					num3 = scan.nextInt();
					if (num3 < smallest)
						smallest = num3;
					if (num3 > largest)
						largest = num3;
					System.out.println("Do you want to enter another number: 0-NO, 1-Yes");
					anotherNumber = scan.nextInt();
				} while (anotherNumber == 1);

				System.out.println();
				System.out.println("The smallest value: " + smallest);
				System.out.println("The largest value: " + largest);

			} else if (anotherNumber == 0) {
				System.out.println("The smallest value: " + smallest);
				System.out.println("The largest value: " + largest);
			}

		   }else if (num2 > num1) {
				largest = num2;
				smallest = num1;
				System.out.println("Do you want to enter another number: 0-NO, 1-Yes");
				anotherNumber = scan.nextInt();
				if (anotherNumber == 1) {
					do {
						System.out.println("Enter your next number: ");
						num3 = scan.nextInt();
						if (num3 < smallest)
							smallest = num3;
						if (num3 > largest)
							largest = num3;
						System.out.println("Do you want to enter another number: 0-NO, 1-Yes");
						anotherNumber = scan.nextInt();
					} while (anotherNumber == 1);
					System.out.println();
					System.out.println("The smallest value: " + smallest);
					System.out.println("The largest value: " + largest);

				} else if (anotherNumber == 0) {
					System.out.println("The smallest value: " + smallest);
					System.out.println("The largest value: " + largest);
				}
		   
			}

	}

}
