package assignment30_40;
import java.util.*;
public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter price in cents:");
		
		
		
		int itemPrice;
		itemPrice=scan.nextInt();
		
        int quarters,dimes,nickels,change;
		
        change=100-itemPrice;
		
        quarters=change/25;
		change=change%25;
		
		dimes=change/10;
		change=change%10;
		
		nickels=change/5;
		change=change%5;
		
		
		if(itemPrice<25 || itemPrice>100 || itemPrice%5!=0 ) {
			System.out.println("Invalid price!");
		
		}else if(itemPrice>25 || itemPrice<100 || itemPrice%5!=0) {
			System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
		
		}
		
		
		
	}

}
