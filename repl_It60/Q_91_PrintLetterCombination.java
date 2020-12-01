package repl_It60;





public class Q_91_PrintLetterCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		/*
		 Write a loop that displays all possible combinations of two letters where the letters are 'z', or 'y', or 'x', or 'w', or 'v'. The combinations should be displayed in descending alphabetical order:

             zz
             zy
             zx
             zw
             zv
             yz
             ....
             vv
             
             */
		
		
		//System.out.println(myChar);
		//System.out.println(++myChar);
		//System.out.println(--myChar);
		for(char myChar='z' ; myChar>='v' ; myChar--) {
			
		
          for(char myChar2='z' ; myChar2>='v' ; myChar2--) {
			System.out.println(myChar + "" + myChar2);
		}

		}
        // for(char myChar='z' ; myChar>='v' ; myChar--) {
        	// System.out.println(myChar);
	     //         }
         
         
	}

}
