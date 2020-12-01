package scanner;
import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// tas3
		/*Create an interactive program to ask user for hourly wage and
		 *  generate minute that day have
		 */
		
		//Task4
		/*Create an interactive program to ask user for hourly wage 
		 * and generate yearly salary
		 * assume that he works 2080 hour for a year
		 * */
		//Task5 :
		/*Create an interactive program to ask user for hourly wage and generate yearly*/
		
		
		Scanner scan =new Scanner(System.in);
		System.out.println("How many minutes are there in day ?");
		int day=scan.nextInt();
		int minute=day*24*60;
		System.out.println(day + " day have " + minute + " minutes ");

	}

}
