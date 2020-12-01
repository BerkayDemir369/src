package repl_It60;

public class Q_71Evens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 2 4 6 8 10 12 14 
		 16 18 20 22 24 26 28 
         30 32 34 36 38 40 42 
         44 46 48 50 52 54 56 
         58 60 62 64 66 68 70 
         72 74 76 78 80 82 84 
         86 88 90 92 94 96 98 
         100 
        */
	int num=2;
	for(int k=1 ; k<=8 ; k++) {
		for(int j=1 ; j<=14 ; j++) {
			if(num %2==0 && num<=100) {
				System.out.print(num + " ");
				
			}
			num++;
		}
		System.out.println();
		
	}
	
	
		
			
				
		
	}

}
