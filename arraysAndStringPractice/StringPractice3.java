package arraysAndStringPractice;

public class StringPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str = "aaaabbbbcccdddeeeffffgggghhhhhhiiiijjjjkkkkk";
					//"aabcca";
		
		String result = "";  // "abc"
		
							// [a, a, b, c, c, a]	
		for(String each  :   str.split("")  ) {
			
			if( ! result.contains(each) ) {
				result += each;
			}
			
		}
		
		
		System.out.println(result);
					
		
		
	}
	
}

/*
Remove duplicated characters
	"aabcca"
	
	"abc"
*/
