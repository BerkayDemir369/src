package assignment_14_OPP;

public class Atts {
	
	public String name;
	public String color;
	public int amount;

	public String asString(String name,String color, int amount) {
		this.name=name;
		this.color=color;
		this.amount=amount;
		return "name: " + name + " color: " + color + " amount: " + amount ;
		
	}
	
	public static void main(String[] args) {
		
		Atts a= new Atts();
		a.name="table";
		a.color="brown";
		a.amount=1;
		
		System.out.println(a.asString("table","brown",1));
	}
}

