package repl_it_Array;

import java.util.Scanner;

public class Q132_Diving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Scanner input = new Scanner(System.in);
		    float[] score = new float[7];
		    //WRITE YOUR CODE HERE
		    float total =0;
		    float min=11;
		    float max=0;
		    float difficulty=0;
		    float score1=0;
		    for(int i=0 ; i<score.length ; i++) {
		    	
		    		System.out.println("Enter score for judge " + (i+1) + ":");
		    		score1=input.nextFloat();
		    		score[i]=score1;
		    		
		    		if(score[i]>=max) {
		    			max= score[i];
		    			
		    		}
		    		if(score[i]<min){
		    			min=score[i];
		    		}
		    	total += score[i];
		    }
		    System.out.println("Enter difficulty:");
		    difficulty=input.nextFloat();
		    total= total-max-min;
		    total= (total*difficulty)*0.6f;
		    
		    // FINAL OUTPUT
		    System.out.printf("Total: %.2f", total);
	}

}
