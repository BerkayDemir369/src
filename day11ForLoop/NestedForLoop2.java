package day11ForLoop;

public class NestedForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		for(int i=0 ; i<3;i++) {
			System.out.println("Outer Loop at states :" + i);
			for(int p=0 ; p<3 ;p++) {
				System.out.println("Inner loop at states: " + p);
				if(p==3) {
					System.out.println("p");
				}
			}
		}
	}

}
