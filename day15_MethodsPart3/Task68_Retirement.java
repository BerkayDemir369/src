package day15_MethodsPart3;

public class Task68_Retirement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		yearsUntilRetirement("Mike",1950);

		}
		
		
		public static void yearsUntilRetirement(String name,int year) {  //name=MiKE  year=1950
			
			 //retirement age = 65 - age
			
			int retiremenAge = 65 - calculateAge(year);
			
			System.out.println(name  + " retires in " + retiremenAge + " years");
			
			
			
		}
		
		
		public static int calculateAge(int yearBirth) {
			
			return 2019-yearBirth;
			
	}

}
