package polymorphism.overriding;

import java.util.Scanner;

class Airlines {
	void display(String s) {
		System.out.println("Welcome to " + s);
	}

	void discount() {
		System.out.println("Providing the discount as per airlines.");
	}
}

class Indigo extends Airlines {
	float price = 0;

	@Override
	void discount() {
		super.discount();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Mumbai to Delhi........5000");
		System.out.println("2.Mumbai to Banglore.....7000");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			price = 5000;
			cal_discount();
			break;
		case 2:
			price = 7000;
			cal_discount();
			break;
		}
	}

	void cal_discount() {
		System.out.println("We are giving 5% discount on your tickets");
		price = price - price * 0.05f;
		System.out.println("Alter discount your ticket price is...." + price);
		System.out.println("Thank you for visiting, have a safe journey. ");
	}
}

class AirArabia extends Airlines {
	float price = 0;

	@Override
	void discount() {
		super.discount();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Mumbai to Dubai........10000");
		System.out.println("2.Mumbai to Banglore.....12000");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			price = 10000;
			cal_discount();
			break;
		case 2:
			price = 12000;
			cal_discount();
			break;
		}
	}

	void cal_discount() {
		System.out.println("We are giving 3% discount on your tickets");
		price = price - price * 0.03f;
		System.out.println("Alter discount your ticket price is...." + price);
		System.out.println("Thank you for visiting, have a safe journey.");
	}
}

public class AirlinesMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Indigo");
		System.out.println("2.Air Arabia");
		String s = sc.next();
		Airlines a;
		if (s.equalsIgnoreCase("Indigo")) {
			a = new Indigo();// 0x200
			a.display("Indigo Airlines");
			a.discount();
		} else {
			a = new AirArabia();// 0x400
			a.display("Air Arabia Airlines");
			a.discount();
		}
	}
}
