package assignment_19thDec;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base number: ");
		int base = sc.nextInt();
		System.out.println("Enter index number: ");
		int index = sc.nextInt();
		int power = 1;
		if (index == 0) {
			power = 1;
		} else {
			for (int i = 1; i <= index; i++) {
				power = power * base;
			}
		}
		System.out.println("Power = " + power);
	}

}
