package practice;

import java.util.Scanner;

public class SumOfNNumbers {
	public static void main(String[] args) {
		int add = 0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			add = add + i;
		}
		System.out.println(add);
	}
}
