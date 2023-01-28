package string;

import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String username = sc.next();
		System.out.println("Enter Password");
		String password = sc.next();
		char ch[] = password.toCharArray();
		int flag = 0;
		int count = 0, charcount = 0;

		if (password.length() < 8) {
			System.out.println("password must be 8 char long.");
			flag = 1;

		}

		if (password.contains(" ")) {
			System.out.println("space is not allowed");
			flag = 1;
		}

		if (!password.contains("@") || password.contains("#")) {
			System.out.println("at least one special @ or,# character must be present.");
			flag = 1;
		}

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= '0' && ch[i] <= '9') {
				count = 1;
			}
		}
		if (count == 0) {
			System.out.println("at least one digit required");
		}

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 95) {
				charcount = 1;

			}

		}
		if (charcount == 0) {
			System.out.println("at least one uppercase required");
		}

		if (flag == 0) {
			System.out.println("Username is.." + username);
			System.out.println("Password is.." + password);

		}

	}

}
