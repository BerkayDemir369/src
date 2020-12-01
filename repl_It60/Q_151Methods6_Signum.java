package repl_It60;

import java.util.Scanner;

public class Q_151Methods6_Signum {


		// TODO Auto-generated method stub
		 public static void sign(int n)
		  {
		    //your code here
			 if(n>0) {
				 System.out.println("1");
			 }else if(n<0) {
				 System.out.println("-1");
			 }else if(n==0) {
				 System.out.println("0");
			 }
		  }//end sign
		  
		  public static void main(String[] args) {
		     Scanner inp = new Scanner(System.in);
		     int n = inp.nextInt();
		    
		    sign(n);
	}

}
