package practice;

import java.util.*;

public class LargestNo {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int largest = num1;
		if (num2 > largest) {
			largest = num2;
		}
		if (num3 > largest) {
			largest = num3;
		}
		System.out.println(largest);
	}

}
