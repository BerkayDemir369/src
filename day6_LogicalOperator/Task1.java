package day6_LogicalOperator;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int ApplesCount = 20;
		int OrangesCount = 30;
		int PearsCount = 30;
		
		boolean comp =ApplesCount < OrangesCount || OrangesCount >= PearsCount;
		// 20<30 || 30>=30 = T ----- = T;  
		System.out.println(comp);
		
		int b =2;
		boolean res= ++b ==2 || --b== 2 && --b ==2;
		// b in memory= 2=>3 =>2
		//res         = 3==2 || 2==2 && 1 ==2; // F || T && F //  F|| F =F
		System.out.println("res = " + res);
		
		
		
		
	}

}
