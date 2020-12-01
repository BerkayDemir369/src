package assignment_8;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println(c_profits(100, 120));
		}
		
		public static String c_profits (int buyPrice,int sellPrice)
		  {
		    if(buyPrice<sellPrice){
		      return "profit";
		    }else if(buyPrice>sellPrice){
		      return "loss";
		    }else{
		      return "no loss";
		    }
	
		  }
	
}
