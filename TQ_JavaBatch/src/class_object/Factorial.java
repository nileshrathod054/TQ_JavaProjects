package class_object;

import java.util.Scanner;

public class Factorial {

	void cal(int num) {
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		f.cal(num);
	}

}
