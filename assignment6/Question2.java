package assignment6;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		for(int row=2; row<=7 ; row++) {
			for(int column=1 ; column<=7-i ; column++) {
				System.out.print(column + " ");
			}
			System.out.println();
			i++;
			
		}
		int j=6;
		for(int row2=1; row2<=7 ; row2++) {
			for(int column2=1 ; column2<=7-j ; column2++) {
				System.out.print(column2 + " ");
			}
			System.out.println();
			j--;
		}
	}

}
