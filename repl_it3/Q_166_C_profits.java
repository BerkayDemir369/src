package repl_it3;

public class Q_166_C_profits {

	/*c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
	 * 
      it returns a string value that can be "profit","loss","no loss"
      example:
      c_profis(100,1500)
      returns : "profit"
      */
	
	
	
	 public String c_profits (int buyPrice,int sellPrice)
	  {
	    //your code here
		 if(buyPrice > sellPrice) {
			 return "profit" ;
		 }else if(sellPrice<buyPrice) {
			 return "loss";
		 }else {
			 return "no loss";
		 }
		 
		
	  
	  }
}
