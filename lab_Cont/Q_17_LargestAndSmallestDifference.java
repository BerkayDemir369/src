package lab_Cont;

public class Q_17_LargestAndSmallestDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Question-1
Write a method that accepts an array and print the difference 
between the largestand smallest values in the array.
    int[] x = {10,3,5,6} = > 7
 * int[] y = {7,2,10,9}  = > 8
 * int[] z= {2,10,7,2} = > 8*/
		
		 int[] x = {10,3,5,6};
		System.out.println(difference(x));
	}

	public static int difference(int[] arr) {
		int max = 0;
		int smallest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}
		}
		int min = max;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

		}
		return max-min;
	}
}
