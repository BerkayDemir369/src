package exercise;

import java.util.ArrayList;

public class Q_195_ArraySize {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr =new ArrayList<>();
		arr.add(5);
		arr.add(8);
		arr.add(9);
		
		System.out.println(sum(arr));
		
	}

	public static int sum(ArrayList<Integer> ints) {
		
		int sum=0;
		for(Integer each : ints) {
			sum += each ;
		}
		
		return sum;
	}
}
