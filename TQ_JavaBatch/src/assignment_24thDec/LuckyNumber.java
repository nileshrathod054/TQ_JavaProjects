package assignment_24thDec;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car Number");
		int car_no = sc.nextInt();
		if (car_no < 1000 || car_no > 9999) {
			System.out.println(car_no + " is not a valid car number.");
		} else {
			while (car_no != 0) {
				int lucky_no = car_no % 10;
				sum = sum + lucky_no;
				car_no = car_no / 10;
			}
			if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
				System.out.println("Lucky Number");
			} else {
				System.out.println("Sorry its not my lucky number");
			}
		}
	}
}
