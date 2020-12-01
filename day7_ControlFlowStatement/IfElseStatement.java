package day7_ControlFlowStatement;

public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

            int score =80;
		
		if (score>=70) {
			System.out.println("Execelent");
			System.out.println("You passed with grade A");
			
		}else {
			System.out.println("You failed");
		}
		
		//=============================================================
		System.out.println("**********************************************");
		int sales,bonus;
		double commisionRate,salary;
		
		sales=5200;
		salary=10000;
		
		if (sales>5000) {
			bonus=500;
			commisionRate=1.12;
			salary=salary*commisionRate+bonus;
			}else {
				bonus=100;
				commisionRate=1.10;
			}
		    salary=salary*commisionRate+bonus;
		    System.out.println("Salary = " + salary);
		
		
		
	}

}
