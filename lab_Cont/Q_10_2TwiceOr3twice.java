package lab_Cont;

public class Q_10_2TwiceOr3twice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Question-10Write a method that accepts an array and
		 *  prints true if the arraycontains 2 twice or 3 twice.
		 *  int[] x = {2,2}; = > true
		 *  int[] y = {3,3}; = > true
		 *  int[] a = {2,3}; = > false
		 *  int[] b = {12,20,42}; = > false
		 *  int[] c = {2,2,2}; = > false*/
		int[] x = {2,2}; //= > true
		System.out.println(elements(x));
	}

	public static boolean elements(int[] arr) {
		int counter2=0;
		int counter3=0;
		
			for(int value : arr) {
				if(value==2) {
					counter2++;
				}else if(value==3) {
					counter3++;
				}
			}
			if(counter2==2 || counter3==2) {
				return true;
			}else {
				return false;
			}
		
	}
}
