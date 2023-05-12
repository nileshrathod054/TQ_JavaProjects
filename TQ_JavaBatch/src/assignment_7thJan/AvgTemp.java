package assignment_7thJan;

import java.util.Scanner;

public class AvgTemp {
	public static void main(String[] args) {

		float temp[] = new float[7];
		float total = 0;
		float average = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature of rainfall of the week.");

		for (int i = 0; i < 7; i++) {
			temp[i] = sc.nextFloat();
			total = total + temp[i];

		}
		average = total / 7;
		System.out.println("Average temperature of the week is : " + average);
	}
}
