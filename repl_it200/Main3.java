package repl_it200;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Question223
		 * This assignment is about another calculator class. this time we will calculate two attributes x and y and put the result in an attribute named result.

x, y and results are all private attributes of int type.

3 Instance variables:
  1) names: x, y, result
      type: int
      Visibility/Access modifier: private
 
Instance Methods:
   - getResult() - getter method for private result
   - setY(int y) - setter method for private y
   - setX(int x) - setter method for private x
 -  void plus() - adds x and y (x+y) values and assigns to result 
   - void minus() - subtracts x and y(x-y) values and assigns to result 
 

example:*/
		Calc1 a = new Calc1();
		  a.setX(1);
		  a.setY(1);
		  a.plus();
		  System.out.println("1+1 = "+ a.getResult());//1+1 = 2
	}

}
