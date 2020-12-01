package assignment6;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=1;
		int k=6;
		for(int row2=7; row2 >=1 ; row2-- ) {
			for(int column2=1; column2<=7-j ; column2++) {
				System.out.print("1");
			}
		
			for(int column=1 ; column<=7-k ; column++) {
				System.out.print(j );
			
				} 
					
			
			
			System.out.println();
			j++;
			k--;
		}
	}

}
