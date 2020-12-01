package day10_controlFlowStatement;

public class Task44KphToMph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Constants
				final int STARTING_KPH=60;
				final int MAX_KPH=130;
				final int INCREMENT=10;
				
				//VARIABLES
				int kph;   //to hold the speed in kph
				double mph; //to hold the speed in mph
				
				//Display the table header
				System.out.println("KPH\t\tMPH");
				System.out.println("---------------------");
				
				for(kph=STARTING_KPH ; kph<=MAX_KPH ; kph+=INCREMENT) {
					
					//calculate the mph
					mph=kph*0.6214;
					
					//Display the speeds in kph and mph
					System.out.println(kph + "\t\t" + mph);
				}
			
		
	}

}
