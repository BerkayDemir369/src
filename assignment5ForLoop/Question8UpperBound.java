package assignment5ForLoop;

public class Question8UpperBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int bound=7;
		int count=0;
		for(int num=1 ; num<=bound ; ++num) {
			count+=num;
			System.out.print(num);
			System.out.print("+");
		}
		System.out.println("=" + count);
		
		
		
		
	}

}
