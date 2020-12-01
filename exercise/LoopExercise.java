package exercise;

public class LoopExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j=6;
		for(int row=1; row<=7 ;row++ ) {
		for(int i=1; i<=7-j ; i++) {
			System.out.print(i);
		}
		j--;
		System.out.println();
		}
		
		int k=1;
		for(int row2=1 ; row2<=7 ; row2++) {
		for(int i2=1 ; i2<=7-k ; i2++) {
			System.out.print(i2);
		}
		k++;
		System.out.println();
		
		}
	}

}
