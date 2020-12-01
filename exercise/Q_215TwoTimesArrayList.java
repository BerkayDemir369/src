package exercise;

import java.util.ArrayList;

public class Q_215TwoTimesArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		twoTimes(null);
	}

	
	public static ArrayList<Integer> twoTimes(ArrayList<Integer> list){
		
		ArrayList<Integer> newList = new ArrayList<>();
		
		for(int i=0 ; i<list.size() ; i++) {
			newList.add(list.get(i));
			newList.add(list.get(i));
		}
		
		
		
		return newList;
		
	}
}
