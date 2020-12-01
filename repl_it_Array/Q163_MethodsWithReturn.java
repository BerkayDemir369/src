package repl_it_Array;

public class Q163_MethodsWithReturn {
	
	
	 public int  count_appearance(String[] arr,String t)
	  {
		 int count=0;
		 for(String each : arr) {
			 if(each.equals(t)) {
				 count++;
			 }
		 }
		 return count;
		 
	  }
}
