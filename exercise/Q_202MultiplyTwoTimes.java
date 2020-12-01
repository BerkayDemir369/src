package exercise;

import java.util.ArrayList;

public class Q_202MultiplyTwoTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void timesTwo(ArrayList<Integer> nums) {
		
		int count= nums.size();
		
		for(int i=0 ; i<count ;i ++) {
			nums.set(i,nums.get(i)*2);
		}
	}
}
