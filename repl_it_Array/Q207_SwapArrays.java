package repl_it_Array;

public class Q207_SwapArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] do_switch(int[] i) 
	 {

		int temp=i[0];
		i[0]=i[i.length-1];
		i[i.length-1]=i[0];
		return i;
		}
}
