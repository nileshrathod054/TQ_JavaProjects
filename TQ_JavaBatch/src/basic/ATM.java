package basic;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		int pin = 7218;
		int balance = 1000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username");
		String username = sc.nextLine();

		System.out.println("Enter the pin number");
		int u_pin = sc.nextInt();
		System.out.println("** Welcome to SBI ATM ***");
		System.out.println("###### WELCOME $$$$ " + username);

		int choice = 0;
		if (pin == u_pin) {
			do {
				System.out.println("Automated Teller Machine");
				System.out.println("Choose 1 for Withdraw");
				System.out.println("Choose 2 for Deposit");
				System.out.println("Choose 3 for Check Balance");
				System.out.println("Choose 4 for Exit");
				// System.out.println("Your Money has been Successfully Withdraw");

				System.out.println("Enter choice");
				choice = sc.nextInt();
				switch (choice) {
				case 1: {
					System.out.println("Enter the withdraw amount");
					int withdraw = sc.nextInt();

					if (withdraw > balance) {
						System.out.println("Insufficent balance");
					} else {
						balance = balance - withdraw;
						System.out.println("You has been Succesfully withdraw amount");
						System.out.println("Plz check your balance after withdraw");
						break;
					}
				}
				case 2: {
					System.out.println("Enter the amount to deposit");
					int dep = sc.nextInt();

					balance = balance + dep;
					System.out.println("You has been Succesfully deposit amount");
					System.out.println("Plz check your balance after deposit");
					break;

				}
				case 3: {
					System.out.println("balance is :" + balance);
					break;
				}
				case 4: {
					System.exit(0);
				}
				}
			} while (choice != 4);// while(true)

		} else {
			System.out.println("@@@@@* Sorry Wrong Pin $$$$$$");

		}

	}

}
