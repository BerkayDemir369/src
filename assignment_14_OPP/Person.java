package assignment_14_OPP;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	public Person() {
		this.firstName="undefined";
		this.lastName="undefined";
	    this.age=-1;
	}
	
	public Person(String firstName , String lastName , int age) {
		
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

	
	
	
	@Override
	public String toString() {
		return "\"" + firstName + " | " + lastName + " | " + age  + "\"" ;
	}

	public static void main(String[] args) {
		Person person= new Person();
		
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
		
		person.setFirstName("Fatima");
		person.setLastName("Lee");
		person.setAge(22);
		
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getAge());
		System.out.println(person.toString());
		
	}
	
	
	
	
	
	
	
}
