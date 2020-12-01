package repl_it3;

public class Q_184_at_3_getsTwo {

	 public static String at3(String target,String word)
	  {
	    
		 return target.substring(0,3).concat(word).concat(target.substring(3,target.length()));
	  }
}
