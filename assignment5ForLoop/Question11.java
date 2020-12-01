package assignment5ForLoop;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        for(int row=4 ; row>=1 ; row-- ) {
        	for(int j=1 ; j<=4-row ; j++) {
        		System.out.print(" ");
        	}
        	
        	for(int column=row ; column>=1 ; column--) {
        		
        		System.out.print(column + " ");
        		
        	}
        	
        	System.out.println();
        }
        
		
			
			
		 
			
			}
}
