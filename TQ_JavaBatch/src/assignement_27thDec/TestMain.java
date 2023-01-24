package assignement_27thDec;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		VolumeCalculator vol = new VolumeCalculator();
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter 1: Find volume of the cylinder.");
		System.out.println("Enter 2: Find volume of the cuboid.");
		System.out.println("Enter your choice.");
		choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("Enter radius");
			double radius = sc.nextDouble();
			System.out.println("Enter height");
			double height = sc.nextDouble();
			System.out.println("Volume of the cylinder is : " + vol.calculateVolume(radius, height));
		} else if (choice == 2) {
			System.out.println("Enter the length");
			int length = sc.nextInt();
			System.out.println("Enter the breadth");
			int breadth = sc.nextInt();
			System.out.println("Enter the height");
			int height = sc.nextInt();
			System.out.println("Volume of the cuboid is : " + vol.calculateVolume(length, breadth, height));
		} else {
			System.out.println("Invalid Choice");
		}

	}

}
