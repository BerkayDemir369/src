package repl_it_Array;

import java.util.Arrays;

public class Q171_ChessBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String[][] chessBoard = new String[8][8];
		    //WRITE YOUR CODE HERE
		    for(int row=0 ; row<8 ; row++) {
		    	for(char myChar='a' ; myChar<='h' ; myChar++) {
		    		int col=myChar-97;
		    		chessBoard[row][col]= row+1 + "" +myChar ;
		    	}
		    }
		    //DO NOT CHANGE
		    System.out.println(Arrays.deepToString(chessBoard));
	}

}
