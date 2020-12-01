package assignment_8;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(waterTax(100));

		}
		
		public static double waterTax(double units)
		  {
		    double bill = 0.0;
		    
		  
		    if(units<=50){
		    bill = units * 0.60;
		    
		   }else if(units>50&&units<=100){
		      bill = units * 0.90;
		      
		   }else if(units>100&&units<=150){
		      bill = (units * 0.90)+50;
		      
		   }else if(units>150){
		      bill = (units * 0.90)+100;
		   }	      	        
		    	    
		    return bill;
	}

}
