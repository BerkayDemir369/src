package repl_it3;

public class Q_178SimpleRoomBook {

	 public boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
	  {
		 
		 if(!isAvailable) {
			 return false;
		 }
		 if(year != 2018) {
			 return false;
		 }
		 if (month == 7 && day>=1  && day<=8) {
			 return false;
		 }
		 
		 return true;
	  }
}
