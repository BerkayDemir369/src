package day20_StringManipulation;

public class Task80_CheckString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkedString("Your order confirmation number is XYZ", "confirmation");

		}
		
		public static void checkedString(String str1,String str2) {
			
			if(str1.contains(str2)) {
				
				System.out.println(str1.indexOf(str2));
				
			}else {
				
				System.out.println("Not found");
				
			}
	}

}
