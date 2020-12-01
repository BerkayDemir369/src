package assignment30_40;
import java.util.*;
public class SecondConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your seconds :");
		
		int hours,minutes,seconds;
		int inputSeconds;
		inputSeconds=scan.nextInt();
		
		hours=inputSeconds/3600;
		seconds=(inputSeconds%3600)%60;
		minutes=(inputSeconds%3600)/60;
		
		System.out.println(hours + "hours, " + minutes + " minutes, and " + seconds + "seconds ");
		
		
		
		
		
		
		
		
		
				
	}

}
