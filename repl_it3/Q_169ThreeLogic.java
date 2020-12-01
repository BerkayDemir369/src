package repl_it3;

public class Q_169ThreeLogic {

	
	/*This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.
     It returns true only if both a and b are true or c is true.
     */
	 public boolean threeLocks(boolean a, boolean b, boolean c) {
		    
		   // return (a==true && b==true) || c==true ;
		      return (a && b) || c;
		    
	  }//end threeLocks
	
	
}
