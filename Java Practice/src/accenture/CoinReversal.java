package accenture;

import java.util.Scanner;

public class CoinReversal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter the number of coins");
		int num = scanner.nextInt();
		String[] coins = new String[num];
		System.out.println("Enter the coins");
		for (int i = 0; i < num; i++) {
			coins[i] = scanner.next();
		}
		for (int i = 0; i < coins.length - 1; i++) {
			if (coins[i].equals(coins[i + 1])) {
				coins[i + 1] = coins[i].equals("H") ? "T" : "H";
				count++;
			}
		}
		System.out.println("Minimum number of coins to be reversed: " + count);
	}

}
