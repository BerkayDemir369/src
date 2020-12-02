package day35_Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee();
		Employee e2=new Employee("Mark Jones",39119);
		Employee e3=new Employee("Tedd",81755,"sales","sales person");
		System.out.println(e1.getName() + "|" + e1.getIdNumber() + "|" + e1.getDepartment() + "|" + e1.getPosition());
		System.out.println(e2.getName() + "|" + e2.getIdNumber() + "|" + e2.getDepartment() + "|" + e2.getPosition());
		System.out.println(e3.getName() + "|" + e3.getIdNumber() + "|" + e3.getDepartment() + "|" + e3.getPosition());
		e1.setName("Mike");
		e1.setIdNumber(54879);
		e1.setName("Accounting");
		e1.setPosition("Vp");
		System.out.println(e1.getName() + "|" + e1.getIdNumber() + "|" + e1.getDepartment() + "|" + e1.getPosition());
		System.out.println(e1.toString());
	}
	

}
