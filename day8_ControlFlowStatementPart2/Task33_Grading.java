package day8_ControlFlowStatementPart2;

public class Task33_Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         int mark=90;
		
		if(mark<60) {
			System.out.println("Fail");
		}else if(mark>=60 && mark<90) {
			System.out.println("Pass");
		}else if(mark>90) {
			System.out.println("Passed with distinction");
		}else {
			System.out.println("Invalid Score");
		}
	}

}
