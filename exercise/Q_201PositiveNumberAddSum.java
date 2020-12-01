package exercise;

import java.util.ArrayList;

public class Q_201PositiveNumberAddSum {

	public static void main(String[] args)
	{
		ArrayList<Integer> newList2 =new ArrayList<>();
		
		appendPosSum(newList2);
	}
	//create your method below
	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){ 
		
		ArrayList<Integer> newList =new ArrayList<>();
		int sum=0;
		for(Integer value : list) {
			if(value>0) {
				newList.add(value);
				sum += value;
			}
		}
		newList.add(sum);
		
		
		
		return list;
		
	}
}
