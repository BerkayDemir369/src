package assignment40_50;
import java.util.*;
public class PositiveNegative41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter a number:");
      int number=scan.nextInt();
      if(number>0) {
    	  System.out.println(number +" is positive");
    	  
      }else if(number<0) {
    	  System.out.println(number +" is negative");
      }else if(number==0) {
    	  System.out.println("it is zero");
      }
	}

}
