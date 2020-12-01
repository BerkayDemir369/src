package day7_ControlFlowStatement;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score =90;
		
		if (score>=70) {
			System.out.println("Execelent");
			System.out.println("You passed with grade A");
			
		}
		
		if (score<=70) {
			System.out.println("Try Again Please");
		}
		
		// =========================second examples ===================================
		
		int sales,bonus;
		double commisionRate,salary;
		
		sales=5200;
		salary=10000;
		
		if (sales>5000) {
			bonus=500;
			commisionRate=1.12;
			salary=salary*commisionRate+bonus;
			
		}
		
		
		System.out.println("Salary = " + salary);
		
		//=======================third examples=================================
		
		
		
		
		
		
		
		
		
	}

}
