package exercise;

import java.util.ArrayList;

public class Q_206ArrayListBooleanMethod {
	
	public static void main(String[] args)
	{
		ArrayList<Boolean> b2 = new ArrayList<>();
		b2.add(true);
		b2.add(false);
		b2.add(false);
		repeatAl(b2);
	}
	//create your method below
	public static void repeatAl(ArrayList<Boolean> list) {
		
		int count=list.size();
		
		
		for(int i=0 ; i<count ; i++) {
			list.add(list.get(i));
			
		}
		
		System.out.println(list);
		
	}


}
