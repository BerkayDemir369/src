package lab_Cont;

public class Q_12HowManyHaveFirstElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		/*Question-12Write a method that accepts two arrays and
		 *  prints how many of the arrayshave 1 as their first element
		 *  int[] x = {1,2,3}      
		 *  Int[]y={1,3} 
		 *  Output=2
		 *  int[] x = {7,2,3}     
		 *  nt[] y = {1}
		 *  Output = 1
		 *  int[] x = {3,2,4}
		 *  Int[] y = {4,3,4}
		 *  Output = 0
		 *  */
		
		int[] x = {1,2,3}  ;    
		int[]y={1,3} ;
		System.out.println(first(x,y));
	}

	public static int first(int[] arr1 ,int[] arr2) {
		int counter=0;
		
		if(arr1[0]==1) {
			counter++;
		}
		if(arr2[0]==1) {
			counter++;
			
		}
		return counter;
	}
}
