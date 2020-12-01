package repl_it_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q139_FrontPiece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] num = new int[size];
		for(int i =0; i < size; i++) {
			num[i] = scan.nextInt();
		}
		//WRITE YOUR CODE HERE
	//	int[] newArr =(size>=2) ? new int[] { num[0] , num[1]} :new int[] { num[0] } ;
		int[] newArr= new int[size];
		if(size>=2) {
			newArr = new int[] {num[0] , num[1]};
		}else {
			newArr= new int[] { num[0] , num[1] };
		}
		System.out.println(Arrays.toString(newArr));
	}

}
