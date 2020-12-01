package assignment30_40;
import java.util.*;
public class VideoGameCoupons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan=new Scanner(System.in);
         
         System.out.println("Enter number of coupons:");
         
         int coupons=scan.nextInt();
         int candies=coupons/10;
         int gumball=(coupons%10)/3;
         
         if(coupons<3) {
        	 System.out.println("Not enough coupons");
         }else if(coupons>=3) {
        	 System.out.println("Number of Candies: " + candies);
        	 System.out.println("Number of Gumballs: " + gumball);
         }
	}

}
