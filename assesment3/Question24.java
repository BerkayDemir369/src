package assesment3;

public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter=4;
		outer:
			for(int i=0; i<4 ;i++) {
				middle:
					for(int j=0;j<4;j++) {
						inner:
						for(int k=0;k<4;k++) {
							if(k-j>0) {
								break middle;
							}
							counter++;
						}
					 
							
						}
					}
		System.out.println(counter);
						
			
	}

}
