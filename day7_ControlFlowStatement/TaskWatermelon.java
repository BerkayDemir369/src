package day7_ControlFlowStatement;

public class TaskWatermelon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberOfWaterMelon;
		boolean lotsOfWaterMelon;
		lotsOfWaterMelon=false;
		numberOfWaterMelon=40;
		
		if(numberOfWaterMelon>=20) {
			System.out.println("I have more than 20 watermelon");
			lotsOfWaterMelon=true;
		}
		if(lotsOfWaterMelon) {
			System.out.println("Good Job");
		}
		if (lotsOfWaterMelon==false) {
			System.out.println("I need more watermelon");
		}
		
		
		
		
	}

}
