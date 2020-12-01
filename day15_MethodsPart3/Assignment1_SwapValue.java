package day15_MethodsPart3;

public class Assignment1_SwapValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Solution-1 by using 3rd variable  
		//Swapping two variables refers to mutually exchanging the values of the variables. Generally, this is done with the data in memory.
        // The simplest method to swap two variables is to use a third temporary variable :
		
		// DUMMY variable
				int n1=10;
				int n2=20;
				int n3;

				n3=n1;
				n1=n2;
				n2=n3;
				
				System.out.println("n1:"+n1);
				System.out.println("n2:"+n2);
				
				//Solution2 without using 3rd variable
				//Using a arithmetic operations
				n1=n1+n2;
				n2=n1-n2;
				n1=n1-n2;
	}

}
