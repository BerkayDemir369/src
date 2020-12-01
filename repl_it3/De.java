package repl_it3;

import java.util.Scanner;

public class De {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(palindrome("mommom"));
		System.out.println(palindrome(""));
		System.out.println(palindrome("abba"));
		
	}

  public static int palindrome(String word) {
	  
	  String reverse="";
	  
	  if(word.length()==0) {
		  return 0;
	  }else {
		  for(int i=word.length()-1 ; i>=0; i--){
		  reverse += word.charAt(i);
		  
		  
	  }
		  return word.equalsIgnoreCase(reverse) ? 1 : 0 ;
	  }
	  
  }
}
