package day11ForLoop;

public class NestedForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*for(line going 1 to 5
		 * write (-1 * lineNo +5) spaces on the output line.
		 * write (+2 * lineNo -1) # signs on the output line.
		 * go to a new output line.
		 * */
		
		for(int i=1 ; i<=5 ; i++ ) {                          // for loop for Lines
			for(int space=1 ; space<=(-1*i)+5 ;space++) {     //for loop for space
				System.out.print(" ");
			}
			for(int sign=1; sign<=(+2*i)-1 ; sign++) {         //for loop for # sign
			 System.out.print("#");
			}
		
		System.out.println();
		}
		
		//===============================
	
		
	}

}
