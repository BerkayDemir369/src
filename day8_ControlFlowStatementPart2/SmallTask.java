package day8_ControlFlowStatementPart2;

public class SmallTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// write an if else statement that assign 20 to variable y if the variables
		// x is greater than 100. otherwise .it should assign 0 to the variable y
		int x=200;
		int y=10;
		
		if(x>100) {
			y=20;
		}else {y=0;}
         System.out.println("y = " + y);
         
         //==============================================
         //write a Java program
         // 1)Declare and initialize a number
         // 2)Display whether the number is an old or even number
         
         int number=5;
         
         if(number%2==0) {
        	 System.out.println("Number : " + number + " is even number ");
         }else {
        	 System.out.println("Number : " + number + " is old number ");
        	 
         }         
         
         
         //==========================================
         //A triangle is valid if the sun of all three angles is equal to 180 degrees.Write a
         // program that declares three integers as angles and check whether a triangle is valid or not.
         
         int a=60;
         int b=80;
         int c=70;
         if(a+b+c==180) {
        	 System.out.println("This is a valid triangle");
        	 
         }else {
        	 System.out.println("This is not a valid triangle");
        	 
         }
         
         
         
         
	}

}
