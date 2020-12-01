package day8_ControlFlowStatementPart2;

public class If_ElseIf_ElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  /*   --- Syntax --- 
		   
		   *  if(condition1){
	           statement1;	
	        }else if(condition2){
	           statement2;
	        }else if(condition3){
	           statmenet3;
	        }else {statement4}    */
	//Program to display days
		//1)Monday
		//2)Tuesday
		//3)Wednesday
		//4)Thursday
		//5)Friday
		//6)Saturday
		//7)Sunday
		
		int day=5;
		if(day==1) {
			System.out.println("Monday");
		}else if(day==2) {
		    System.out.println("Tuesday");
		}else if(day==3) {
			System.out.println("Wednesday");
		}else if(day==4) {
			System.out.println("Thursday");
			
		}else if(day==5) {
			System.out.println("Friday");
		}else if(day==6) {
			System.out.println("Saturday");
			
		}else if(day==7) {
			System.out.println("Sunday");
		}else {
			System.out.println("Not a valid day");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		       
		
		
		
		
		

	}

}
