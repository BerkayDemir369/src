package assignment6;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	   int i=1;
		for(int row=1; row<=7; row++ ) {
			for(int j=1; j<=row-1 ; j++) {
				System.out.print(" ");
			}
		
			for(int column=i; column<=7; column++) {
				System.out.print(column + " ");
				
			}
			i++;
			System.out.println();
			
		
			
		}
		
		
		for(int row2=6; row2>=1 ; row2-- ) {
			
			for(int space=1; space<=row2-1; space++) {
			System.out.print(" ");
			
		}
			for(int column2=row2; column2<=7 ; column2++) {
				System.out.print(column2 + " ");
				
			}
		
			System.out.println();
			
		}
	}

}
