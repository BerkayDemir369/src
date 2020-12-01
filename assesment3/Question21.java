package assesment3;

public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c=0;
		boolean flag=true;
		for(int i=0;i<8;i++) {
			while(flag) {
				c++;
				if(i>c ||c>3) {
					flag=false;
				}
			}
		}
		System.out.println(c);
	}

}
