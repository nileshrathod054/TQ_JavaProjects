package practice;

import java.util.Scanner;

public class FibonacciSeries {
	public static int result(int n)

	{
		int dp[] = new int[n + 1];

		dp[0] = 0;

		dp[1] = 1;

		for (int i = 2; i <= n; i++)
			dp[i] = dp[i - 1] + dp[i - 2];

		return dp[n];
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number:");

		int n = scan.nextInt();

		System.out.println(result(n));
	}
}
