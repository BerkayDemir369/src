package repl_it200;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person();
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getAge());
		System.out.println(person.toString());
		
		person.setFirstName("Jhon");
		person.setLastName("Doe");
		person.setAge(44);
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getAge());
		System.out.println(person.toString());
		
		
		
		
	}

}
