package exercise;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=14;
		for(int row=1 ; row<=5 ; row++) {
		for(int i=1; i<=15-num; i++) {
			System.out.print(i);
			num=num-i + 1;
			
		}
		System.out.println();
		}
	}

}
