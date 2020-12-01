package assignment40_50;
import java.util.*;
public class QuizQuestion43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner s = new Scanner(System.in);
		    
		    System.out.println("what is the farthest planet in the solar system:" );
		    System.out.println("a)venus" );
		    System.out.println("b)pluto" );
		    System.out.println("c)neptune" );
		    
		    String answer = s.nextLine();
		    if(answer.equals("b")) {
		    	System.out.println("b is correct");
		    }else if(answer.equals("a") || answer.equals("c")) {
		    	System.out.println(answer + " is wrong");
		    	
		    }else {
		    	System.out.println(answer + " is not valid answer");
		    }
	}

}
