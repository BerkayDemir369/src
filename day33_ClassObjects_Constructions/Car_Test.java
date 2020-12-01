package day33_ClassObjects_Constructions;

public class Car_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Car c1=new Car();
		Car c2= new Car("Honda" , "Civic" , 2020 , 5000 , "White");
		
		
		//1-new-call constructor
		//2- which constructor?
		//3-constructor with no parameter in Car class
		
		System.out.println(c1.make);
		System.out.println(c2.color);
		
	}

}
