package repl_it3;



public class Q_181_StringCountSpace {

	
       /*This method gets a string and returns the word count of that string.

         example:
        wordCount("foo bar")
        returns 2 */
   
         

	
	
	
      public static int wordCount(String words) {
    
    		     return words.trim().length()-words.replace(" ", "").length()+1;
	      
      }
}
