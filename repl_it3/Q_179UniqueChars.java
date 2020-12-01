package repl_it3;

public class Q_179UniqueChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  //test your code
	    System.out.println( uniqueChars("wooden-spoon") ) ;
	  }
	  
	  public static String uniqueChars(String str) {
	    //TODO: write your below
		 String uniques="";
		 for(int i =0 ; i<=str.length()-1 ; i++) {
			 String currentChar=str.substring(i,i+1);
			 if(! uniques.contains(currentChar)) {
				 uniques += currentChar ;
			 }
			 System.out.println(uniques);
		 }
		 return uniques;
	}

}
