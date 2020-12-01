package scanner;
import java.util.Scanner;
public class TempretureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		System.out.println("What is the temprature in F ? ");
		
		double farenheit= scan.nextDouble();
		double celcius= (5.0 / 9)*(farenheit-32);
		System.out.println("Farenheit " + farenheit + " is " + celcius + " in celcius ");
		

		}

}
