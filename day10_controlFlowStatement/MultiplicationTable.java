package day10_controlFlowStatement;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int num=10;
		
		System.out.println("Multiplication table for " + num);
		System.out.println("--------------------------------");
		
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(num + "*" + i + "=" + (num*i));
		}
	}

}
