package day34_Constructors;

import java.util.Random;

public class Dice {
	int sides;  //instance variable
	int value;
	
	public Dice(int numSides) {  //constructors with one parameter
		sides=numSides;
		roll();
	}
	
	public void roll() {           
		Random rand = new Random();
		value=rand.nextInt(sides) + 1;
	}
	
	public int getSides() {           
		return sides;
	}
	
	public int getValue() {     
		return value;

	}
}
