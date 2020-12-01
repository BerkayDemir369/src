package repl_it3;

public class Q_200_StringError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*isError method checks if the line of string it gets has the word error at the start of it.

       it gets a string and returns a boolean.
       true if it found the word 'error' an the start of the line string

       example use:

      isError("foo bar")
      returns : false
        */
	isError("error foo bar");
	}
	
	public static boolean isError(String line){
		
		
		return line.startsWith("error");
	}
	
		
	
	  
	
}
