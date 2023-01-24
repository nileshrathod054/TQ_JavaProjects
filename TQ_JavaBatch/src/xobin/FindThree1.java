package xobin;

import java.util.Scanner;

public class FindThree1 {
	public static boolean findThree(int num) {
		boolean ispresent = false;
		while (num > 0) {
			int rem = num % 10;
			if (rem == 3) {
				ispresent = true;
			}
			num = num / 10;
		}
		return ispresent;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean isPresent = false;
		isPresent = findThree(num);
		System.out.println(isPresent);
	}
}
