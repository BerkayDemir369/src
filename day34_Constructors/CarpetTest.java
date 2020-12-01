package day34_Constructors;

public class CarpetTest {

	public static void main(String[] args) {
		Calculator c1=new Calculator(new Floor(10.0, 3.0), new Carpet(10));
		
		double price=c1.getTotalCost();

		System.out.println(price);
		
	}
}
