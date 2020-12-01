package repl_it_Array;

public class Q1771_ThunderBlazz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

public boolean getThunderBlazz(boolean available,boolean gift, int ingredient1 
			  , int ingredient2, int ingredient3) {
			  
			    if(available) {
			    	return true;
			    }
			    
			    if(gift) {
			    	return true;
			    }
			    if(ingredient1 ==1 && ingredient2==2 && ingredient3==3) {
			    	return true;
			    }
			    if(ingredient1 ==3 && ingredient2==1 && ingredient3==2) {
			    	return true;
			    }
			    return false;
			  }	    
}
