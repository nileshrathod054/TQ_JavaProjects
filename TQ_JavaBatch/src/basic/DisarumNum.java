package basic;

import java.util.Scanner;

public class DisarumNum {

	public static void main(String[] args) {
		int num, sum = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		int temp = num;
		while (temp > 0) {
			int rem = num % 10;
			count++;
			temp = temp / 10;
		}
		int disarum = num;
		while (num > 0) {
			int x = 1;
			int rem = num % 10;
			for (int i = 1; i <= count; i++) {
				x = rem * x;
			}
			System.out.println(x);
			sum = sum + x;
			num = num / 10;
			count--;
		}
		if (disarum == sum) {
			System.out.println("It is disarum number");
		} else
			System.out.println("It is not a disarum number");
	}
}
