package exercise;

import java.util.ArrayList;

public class Q_213RemovesAnyInstanceOfNumber {

	 public static ArrayList<Integer> removeInst(ArrayList<Integer> lst,Integer n) 
	  {
		// for(int i=0 ; i<lst.size() ; i++) {
//		    	if(lst.get(i)== 1) {
//		    	lst.remove(i);
//		    	i--;
//		    	}
		    //}
	    //  lst.removeAll(Arrays.asList(n));
		 lst.removeIf(each -> each==n);
	   
		 return lst;
	  }
	  
	  public static void main(String[] args)
	  {
	  
	    ArrayList<Integer>  arr = new ArrayList<>();
	    Integer[] nums = new Integer[]{1,1,2,3};
	   // arr.addAll(Arrays.asList(nums));
	   
	    
	    //lst.remove(new Integer(1));
	   
	    System.out.print(removeInst(arr,1));
	   
	    
	  }//end main
	
}
