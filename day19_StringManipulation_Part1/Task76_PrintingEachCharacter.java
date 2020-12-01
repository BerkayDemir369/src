package day19_StringManipulation_Part1;

public class Task76_PrintingEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str = "Cybertek School";
		
		for(int i=0;i<str.length();i++) {  //last character index is ALWAYS length()-1
			
			System.out.println(str.charAt(i));
			
		}
		
	}

}
