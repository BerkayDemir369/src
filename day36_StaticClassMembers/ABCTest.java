package day36_StaticClassMembers;

public class ABCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ABC.m1(); //no error
		
		//ABC o1 = new ABC(); //error
		//o1.m1();
		
		//whenever all of your methods in your class are static,
		//and you want everyone to call them static way - ClassName.methodname(),
		//then you can simply make your constructor private
	}

}
