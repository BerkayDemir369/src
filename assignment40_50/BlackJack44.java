package assignment40_50;
import java.util.*;

public class BlackJack44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter player score");
		int player=scan.nextInt();
		System.out.println("Enter house ");
		int house=scan.nextInt();
		if(player==21) {
			System.out.println("bust");
		}else if(player<house) {
			System.out.println("player loss");
		}else if(player==house) {
			System.out.println("its a tie");
		}else if(player>house) {
			System.out.println("wins");
		}
	}

}
