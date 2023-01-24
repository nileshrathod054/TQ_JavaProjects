package basic;

import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) {

		double length, breadth, perimeter;

		// double length=20, breadth=10, perimeter;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of  the rectangle");

		length = sc.nextDouble();

		System.out.println("Enter the breadth of  the rectangle");

		breadth = sc.nextDouble();

		perimeter = 2 * (length + breadth);

		System.out.println("The perimeter of the rectangle is : " + perimeter);
	}

}
