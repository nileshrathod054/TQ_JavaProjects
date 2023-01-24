package basic;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// double radius=10, diameter, circumference, area;
		double radius, diameter, circumference, area;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the radius.");

		radius = sc.nextDouble();

		// Diameter of Circle
		diameter = 2 * radius;

		// Circumference of circle
		circumference = 2 * Math.PI * radius;

		// Area of circle
		area = Math.PI * (radius * radius);

		System.out.println("Diameter of the circle is : " + diameter);

		System.out.println("Circumference of the circle is : " + circumference);

		System.out.println("Area of the circle is : " + area);

	}

}
