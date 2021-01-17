package day37_Inheritance;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee();

		emp1.name = "Tom";
		emp1.jobTitle = "SDET";
		emp1.age = 27;
		emp1.gender = 'M';

		emp1.work();

		emp1.eat("Salad");
	}

}
