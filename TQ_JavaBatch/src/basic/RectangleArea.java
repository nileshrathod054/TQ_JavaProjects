package basic;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {

		double length, breadth, area;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of the rectangle.");

		length = sc.nextDouble();

		System.out.println("Enter the breadth of the rectangle.");

		breadth = sc.nextDouble();

		// Area of the rectangle

		area = length * breadth;

		System.out.println("Area of the rectangle = " + area);
	}

}
