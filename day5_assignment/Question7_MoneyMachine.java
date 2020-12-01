package day5_assignment;

public class Question7_MoneyMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int amount,quarters,dimes,nickels,change;
		amount=95;
		change=100-amount;
		
		quarters=change/25;
		change=change%25;
		
		dimes=change/10;
		change=change%10;
		
		nickels=change/5;
		change=change%5;
		
		System.out.println("Price in cents : " + amount);
		System.out.println("Your change is " + quarters + " quarters, " +  dimes + " dimes, " + " and " +  nickels + " nickels");
		
		
		
		
		
		
		
		
		
	}

}
