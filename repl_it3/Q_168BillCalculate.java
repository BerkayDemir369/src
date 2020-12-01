package repl_it3;


   /*This method calculates a water bill, the method gets a double and returns a double.

     The more water you use the more it will cost you (as a fine for wasting water).
     
     the regular calculation under 50 is 
      bill = units * 0.60;
      above 50 is:
      bill = units * 0.90;

     above 100 the calculation is like above 50 but with a 50 as fine

     and above 150 its the same as above 50 (units *0.90) but with a 100 fine added to the price .


     for example:
     waterTax(50)
     returns 30
    */



public class Q_168BillCalculate {

	 public double waterTax(double units)
	  {
	    double bill = 0.0;
	    
	  
	    //your code here
	    
	    if(units <=50) {
	    	return bill += units*0.60;
	    }else if(units>50 && units<100) {
	    	return bill += units*0.90;
	    }else if(units>=100 && units<150) {
	    	return bill += (units*0.90) + 50;
	    }else if(units >=150) {
	    	return bill += (units*0.90) + 100;
	    }
	    
	    
	    //end your code here
	    
	    
	    return bill;
	  }//end waterTax
}
