package lab_Cont;

public class Q_18_SumOfNumbers13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Question-18
		 * Write a function that accepts an array and prints the sum of
		 *  the numbers in the array.Except the number 13 is very unlucky,
		 *   so it does not count and numbers that comeimmediately after a 13
		 *    also do not count
		 *    int[] x = {1,2,2,1} = > 6
		 *    int[] y = {1,1}  = > 2
		 *    int[] a = {1,2,2,1,13} = > 6
		 *    int[] b = {1,2,2,1,13,3} = > 6*/
	}

	public static int sum(int[] arr) {
		int sumNum=0;
		for(int i=0 ; i<arr.length ; i++) {
			if( arr[i]!=13) {
				sumNum += arr[i];
			}else {
				break;
			}
		}
		return sumNum;
	}
}
