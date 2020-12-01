package repl_It60;

public class Q_111Compute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Given int variables k and total that have already been declared, 

          Use a do...while loop to compute the sum of the squares of the first 50 counting numbers, 
          and store this value in total. 
          Thus your code should put 1*1 + 2*2 + 3*3 +... + 49*49 + 50*50 into total. 
          Use no variables other than k and total. 
          Print out the value of the variable total.*/
		
		 int k = 1;
	     int total = 0;
	     
	      
	     do {
				
			int i=k*k;
			total = total + (k*k);
			
				
				k++;
				
			}while(k<=50);
	     System.out.println(total);
	}

}
