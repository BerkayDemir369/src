package repl_it_Array;

public class Q204MethodsStringListen {

	 public static boolean isAnagram(String word1, String word2) {
		    
		for(int i=0; i<=word1.length() ; i++) {
			word1.substring(i,i+1).equals(word2.substring(word2.length()));
			
		}
		return true;
	  }
}
