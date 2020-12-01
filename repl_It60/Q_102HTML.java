package repl_It60;

import java.util.Scanner;

public class Q_102HTML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Write a program, that will read html variable and output attribute value of id attribute (tag)
		  into the console. Input will be provided in a single line as outlined below.
		  If html variable doesn't contain <html> attribute, print out into the console message: "Invalid input!". 

          Example: 
          input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
          output: myid
          */
		
		Scanner scan = new Scanner(System.in);
	    String html = scan.nextLine();
	    
	    if(html.contains("<html>")){
	    	
	    	int indexOfId=html.indexOf("id=");
	    	int beginningIndex=indexOfId+4;
	    	int endingIndex=html.indexOf("\"",beginningIndex);
	    	System.out.println(html.substring(beginningIndex,endingIndex));
	    	
	    	
	    	
	    	
	    }else {
	    	System.out.println("Invalid input!");
	    }
	}

}
