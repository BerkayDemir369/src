package lab_Cont;

public class Q_21_SumOfAll2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Question-21Write a method that accepts an array and prints true 
		 * if the sum of all 2's in the arrayis exactly 8
		 * int[] x = {2, 3, 2, 2, 4, 2}  = > true
		 * int[] x = {2, 3, 2, 2, 4, 2, 2}  = > false
		 * int[] x = {1, 2, 3, 4}  = > false*/
		
		
		int[] x = {2,3,2,2,2,4};
		
		System.out.println(sum28(x));
		
	}
	
	public static boolean sum28(int[] arr) {
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] ==2) {
				
				sum = sum + arr[i];
			}
		}
		
		if(sum == 8 ) {
			return true;
		}
		
		return false;
	}

}
