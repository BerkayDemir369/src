package lab_Cont;

public class Q_16EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Question-16Write a method that accepts an array and 
		 * prints the number ofeven numbers in the array.
		 * int[] x = {2,1,2,3,4} = > 3
		 * int[] y = {2,2,0}  = > 3
		 * int[] z= {1,3,5} = > 0*/
		 int[] z= {1,3,5};
		 System.out.println(even(z));
	}

	public static int even(int[] arr) {
		int counter=0;
		for(int value:arr) {
			if(value%2==0) {
				counter++;
			}
		}
				
			
		return counter;
	}
}
