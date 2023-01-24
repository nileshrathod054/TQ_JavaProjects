package assignment_7thJan;

import java.util.Scanner;

public class Courses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of course : ");
		int size = sc.nextInt();
		int flag = 0;
		String arr[] = new String[5];

		System.out.println("Enter course names : ");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.next();

		}
		System.out.println("Enter the course to be searched : ");
		String course = sc.next();
		for (int i = 0; i < 5; i++) {
			if (arr[i].equalsIgnoreCase(course)) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println(course + " course is availabe.");

		} else
			System.out.println("course is not available.");

	}
}