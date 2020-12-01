package day20_StringManipulation;

public class Task81_TimeStamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String time = "10/01/2019 15:42:00";
		
		System.out.println(timeStamp(time));

	}
	
	public static String timeStamp(String time) {
		
		time = time.replace("/", "").replace(":", "").replace(" ", "");
		
		return time;
	}

}
