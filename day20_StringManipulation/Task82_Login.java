package day20_StringManipulation;

import java.util.Scanner;

public class Task82_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      Scanner scan  = new Scanner(System.in);
		
		System.out.print("Enter your username:");
		String userName = scan.nextLine();
		
		System.out.print("Enter your password:");
		String password = scan.nextLine();
		
		String userNameInSystem = "Mike";
		String passwordInSystem = "123";
		
		if(userName.equals("") && password.equals("")) {
			System.out.println("Username and password fields can not be empty");
		}else if(userName.equals("") && !password.equals("")){
			System.out.println("Username can not be empty");
		}else if(!userName.equals("") && password.equals("")) {
			System.out.println("Password can not be empty");
		}else if(!userName.equals(userNameInSystem) || ! password.equals(passwordInSystem)) {
			System.out.println("Username or password not valid,please verify");
		}else if(userName.equals(userNameInSystem) && password.equals(passwordInSystem)) {
			System.out.println("User logged in  successfully");
		}
		
	}

}
