package day7_ControlFlowStatement;

public class SmallTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//write an if statement that assign 5 to x when y is equal to 20
		
		int x,y;
		x=10;
		y=20;
		if(y==20) {
			x=5;
			System.out.println("x = " + x + " y = "+ y);
		}
		
		
		//===============================================================
		//2-write an if statement that multiplies pay rate by 1/5 if hours is greater than 40
		
		double payRate=1000;
		int hours=50;
		
		if (hours>40) {
			payRate=payRate*1.5;
		}
		
		
		System.out.println("Payrate is " + payRate);
		
		//=============================================================
		//3- write an if statement that sets the variable fees to 50 if the boolean variable max is true 
		
		boolean max=true;
		int fee=20;
		if (max==true) {
			fee=50;
		}
		
		System.out.println("fee is = " + fee);
		
		//=============================================================
		//write an if statement that assign 20 to the variable a if variable b is 50 or c is greater 
		// and equal 100
		
		int a=100;
		int b=20;
		int c=30;
		
		if (b==50 || c>=100) {
			a=20;
		}
		System.out.println("a = " + a);
		
		//5- write an if statement that prints "Ideal Temp" if the temp is between 70 and 80
		
		int temp=75;
		if(temp>=70 && temp<80) {
			
			System.out.println("Ideal Temp");
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
