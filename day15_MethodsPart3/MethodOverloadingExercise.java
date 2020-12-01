package day15_MethodsPart3;

public class MethodOverloadingExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(method1(1.0f,2)); 

	}
	
	public static int method1(int num1,float num2) {
		
		return 5;
		
		
	}
	
	public static float method1(float num1,int num2) {
		
		return 50;
	}

}
