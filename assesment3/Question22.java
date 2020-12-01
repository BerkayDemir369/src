package assesment3;

public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		label1:for(int i=0 ; i<10 ; i++) {
			for(int j=0;j<10;j++) {
				if(i+j-1>10) {
					break label1;
				}
			}
				System.out.println("hello");
		}
	}

}
