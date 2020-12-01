package exercise;

public class ProductsBrokenLimitMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*badP is a method that gets an int array named products and an int named limit.

      products(int[]) - is an int array representing the products it checked,
      if the item is intact it will be represented by 1 if its broken its 0.
      for example: [0,1,1,1,0], this array represents 2 broken items and 3 intact.

     limit(int) - represents the max amount of broken items for this shipment to be 
     considered good (and the method returns true) 
     for example : products [1,1,1,1,0] limit:3,
     there is only 1 broken product and its less then the limit (3)
     return true.
     */
	int[]arr= {0,0,1,1,1};
	int y=3;
	System.out.println(badP(arr,y));
	}
	  public static boolean badP(int[] products,int limit) {
		  
		  int count =0;
		  for(int value :products) {
			  if(value == 0) {
				  count++;
			  }
		  }
		  return count<limit;
	  }
	  
}
