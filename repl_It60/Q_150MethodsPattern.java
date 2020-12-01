package repl_It60;

public class Q_150MethodsPattern {

	
	/*       *****
             *   *
             *   *
             *   *
             *   *
             *****
             
             */
		// TODO Auto-generated method stub

		public static void printHollowRect()
		  {
		   for(int k = 1; k<=5; k++)
		            System.out.print("*");
		    
		    System.out.println();
		    
		    for(int i = 1; i<5; i++)
		             System.out.println("*   *");
		    
		    for(int j = 1; j<=5; j++)
		        System.out.print("*");
		  }
		  
		  public static void main(String[] args) {
		   
		    printHollowRect();
	}

}
