package exercise;

public class Q187_StringSplit {

	  public static String lameDb(String db, String op,String id,String data)
	  {
		 
		  
		  String str2 ="";
		  
		  for(int i = 0 ; i<db.length() ; i++) {
				
			  str2 += db.substring(i,i+1);
			  if(str2.equals(",") || str2.equals("\"")) {
				  
				  str2.replace("",",");
				  str2.replace("","\"");
				  
			  }
			  
		  }
		  return str2;
	  }//end lameDb
	  
	  
	   public static void main(String[] args) 
	   {
	    
	     
	     System.out.print(
	       lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
	       );
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
	       );
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","delete","1","")+"\n"
	       );
	       
	        System.out.print(
	       lameDb("1tst#2bla#3foo","none","1","")+"\n"
	       );
	     
	   }
	  
	

}
