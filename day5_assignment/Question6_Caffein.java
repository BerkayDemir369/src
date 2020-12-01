package day5_assignment;

public class Question6_Caffein {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int drinkMg=500;
		double bottleDose;
		final double overdose=10*100;
        int bottleQuantity;
        
		bottleDose=drinkMg/overdose;
		bottleQuantity=(int)(overdose/bottleDose)/100;
		
		
		
		
		
		System.out.println("Number of milligrams in drink: " + drinkMg + "- max dose for one bottle :" +bottleDose  );
		System.out.println("It would take about " + bottleQuantity+" for a lethal overdose");
		
		
		
	}

}
