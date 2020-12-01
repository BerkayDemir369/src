package assignment40_50;
import java.util.*;
public class VechileRecall45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter vehicle's year:");
        int vechileYear=scan.nextInt();
        
        if((vechileYear>=1995) && (vechileYear<=1998)) {
        	System.out.println("Your vehicle needs to be recalled!");
        }else if((vechileYear==2001) || (vechileYear==2002)) {
        	System.out.println("Your vehicle needs to be recalled!");
        }else if ((vechileYear>=2004) && (vechileYear<=2006)) {
        	System.out.println("Your vehicle needs to be recalled!");
        }else if ((vechileYear>=2015) && (vechileYear<=2017)) {
        	System.out.println("Your vehicle needs to be recalled!");
        }else {System.out.println("Your vechile is fine, enjoy! ");}
        
	}

}
