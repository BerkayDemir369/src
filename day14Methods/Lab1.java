package day14Methods;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*Write a method that accepts a string and a non-negative number, 
	 //	 * and prints a larger string that is number copies of the original String
	 //   stringTimes("Hi", 2); = > HiHi
	 //    stringTimes("Hi", 3); = > HiHiHi
	 //   stringTimes("Hi", 1); = > Hi
	 //   */
		

	
			
			stringTimes("Hi", 4);
		 
			
		}
		
		public static String stringTimes(String string,int number) {
			
			String str = "";
			
			for(int i=0;i<number;i++) {
				
				str = str + string;   
				
			}
			
			
			System.out.println(str);
			return str;
	}

}
