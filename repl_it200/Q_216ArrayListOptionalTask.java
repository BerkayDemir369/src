package repl_it200;

import java.util.ArrayList;



public class Q_216ArrayListOptionalTask {

	 public String blogDb(ArrayList<String[]> r,String id)  {
		    
		  for(String[] value :r ) {
			  if(value[0]==id) {
				  
			return value[1] +"\n" + value[2];
				  
			  }
			
		  }
		  return null; 
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q_216ArrayListOptionalTask m = new Q_216ArrayListOptionalTask();
		    ArrayList<String[]>  arr = new ArrayList<String[]>();
		    arr.add(new String[]{"1","title 1","content"});
		    arr.add(new String[]{"2","title 2","content"});
		    arr.add(new String[]{"3","title 3","content3"});

		    String post = m.blogDb(arr,"3");
		    System.out.println(post);
		    System.out.print(post);
		    //should output:
		    //title 3 
		    //content3
		    
		   
		
	}

}
