package exercise;

import java.util.ArrayList;

public class Q_199Hi_Remove {

	
	public static void removeAll(ArrayList<String> wordList ,String targetword){
		  
		  for(int i=0 ; i <wordList.size() ; i++ ) {
			  if(wordList.get(i).equals(targetword)) {
				  wordList.remove(i);
				  i--;
			  }
		  }
		}
	
}
