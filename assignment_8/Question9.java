package assignment_8;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int result = max(11,5);
		System.out.println("returns: " + result);
		
	}
	
	
	public static int max(int x,int max) {
		
		int result; //local variable
		result =max;  
		int result2;
		result2=x;
	   if(x>max) {
		   return result;
		 
	   }else if(x<max) {
		   return result2;
	   }
		return result;
	}
		
		
			
		
	
}
