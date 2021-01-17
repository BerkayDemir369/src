package reviewOOP;

public class Main_236 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Book.capitalize("aBc"));
		String word="jHon Smith ABC";
		word=word.toLowerCase();
		String[] all =word.split(" ");
		String result="";
		
		for(String each :all) {
			result += each.substring(0,1).toUpperCase()+each.substring(1) + " " ;
			
		}

		result = result.trim();
		System.out.println(result);
		System.out.println(Book.isTitleWord("Apple"));
		Book.isTitleWord("an");
		Book.isTitleWord("Orange");
		Book.isTitleWord("aaa");
	}

}
