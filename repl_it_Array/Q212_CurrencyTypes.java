package repl_it_Array;



public class Q212_CurrencyTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  
	     
	     String[][] test_money =
	     {
	       {"mark","5"},
	       {"shekel","30.5"},
	     };
	   //test_money[0][1]
		   //test_money[1][1]
	     
	     String[][] test_convert=
	     {
	       {"mark","1"},
	       {"shekel","0.5"},
	     };
	     
	    //test_money[0][1]
	   //test_money[1][1]
	    // double res = Main.convertC(test_money,test_convert);
	    //.out.print(res);
	   //  
	}

	public static  double convertC(String[][] money,String[][] convertionRate) {
		
		double sum=0;
		for(int i=0 ; i<money.length ;i++) {
			
//				String amounStr=money[i][1];
//				String rateStr=convertionRate[i][0];
				
				double amount=Double.parseDouble(money[i][1]);
				double rate =Double.parseDouble(convertionRate[i][1]);
				sum += amount*rate;
			
		}
		
		return sum;
		
		
		
	}
}
