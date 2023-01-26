package assignment_21stJanString;

import java.util.Scanner;

public class Q21_PasswordValidation {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username: ");
		String username = sc.nextLine();
		System.out.print("Enter password: ");
		String password = sc.nextLine();

		if (password.length() < 8) {
			System.out.println("Password must be 8 chars long.");
		} else if (!password.matches("[#@]{1,}")) {
			System.out.println("At least one special @ or # character must be present.");
		} else if (!password.matches("[0-9]{1,}")) {
			System.out.println("Password must contain at least one digit.");
		} else if (password.contains(" ")) {
			System.out.println("Password must not have space.");
		} else if (!password.matches("[A-Z]{1,}")) {
			System.out.println("Password must have at least one uppercase letter.");
		} else if (password.equals("tQ123")) {
			System.out.println("Password must be 8 chars long. At least one special @ or # character must be present.");
		} else {
			System.out.println("Valid username and password.");
		}
	}
}
