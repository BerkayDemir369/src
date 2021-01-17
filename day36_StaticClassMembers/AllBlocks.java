package day36_StaticClassMembers;

public class AllBlocks {
	public AllBlocks(int x) {
		System.out.println("One argument constructor");
	}
	public AllBlocks() {
		System.out.println("No argument constructor");
	}
	static {
		System.out.println("First static init");// static block runs one time before anything
		
	}
	{
		System.out.println("First instance init:");
	}
	{
		System.out.println("Second instance init");//instance constructor runs before each constructor
	}
	static{
		System.out.println("Second static init");
	}

}
