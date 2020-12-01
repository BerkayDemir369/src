package assignment30_40;
import java.util.*;
public class CoffeinOverDose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number of milligrams in drink");
		
		int drinkMg=scan.nextInt();
		
		
		final int overdose=(10*1000)/drinkMg;
        
        
		
		
		
		System.out.println("It would take about " + overdose + " for a lethal overdose");
	}

}
