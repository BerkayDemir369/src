package repl_it_Array;

public class Q217Shipping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] x= {1,1,1,0,0,0,0};
       int y=2;
       System.out.println(badP(x,y));
	}

	 public static boolean badP(int[] products,int limit)
	  {
		 int count=0;
		 
	    for(int value:products) {
	    	if(value==0) {
	    		count++;
	    		
	    	}
	    	
	    }
	    return count<limit;
	  }
}
