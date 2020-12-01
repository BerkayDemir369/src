package exercise;

import java.util.ArrayList;

public class Q_198CombineAll {

	
	public static ArrayList<String> combineAl(ArrayList<String> wordList1 , ArrayList<String> wordList2){
		
		ArrayList<String> combineList =new ArrayList<>();
		
       combineList.addAll(wordList1);
       combineList.addAll(wordList2);
       
       return combineList;
		
		
		
	} 
}
