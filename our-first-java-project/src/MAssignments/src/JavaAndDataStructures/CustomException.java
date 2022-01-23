package JavaAndDataStructures;

import java.util.Scanner;
public class CustomException {
	public static void main(String[] args) throws UserNameNotValidException {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter employee's username : ");
		
		String userName = scan.nextLine();
		
		try {
			validateUserName(userName);
		} catch (UserNameNotValidException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void validateUserName(String userName) throws UserNameNotValidException {
		if(userName.startsWith("emp_"))
			System.out.println("Welcome " + userName + ", you are now logged in.");
		else
			throw new UserNameNotValidException("Invalid employee name, should start with emp_");
	}

}


class UserNameNotValidException extends Exception{
	public UserNameNotValidException(String message) {
		super(message);
	}
}
