package assignment_29thDec;

public class Car {
	static String model;
	static int totalCarSold;

	public static void main(String[] args) {
		Car.totalCarSold = 10;
		System.out.println("Total cars sold : " + Car.totalCarSold);
		Car car1 = new Car();
		Car car2 = new Car();
		car1.totalCarSold = 15;
		System.out.println("Total cars sold : " + car2.model);
		car1.model = "Hyundai";
		System.out.println("Car model : " + car2.model);
		staticMethod();
		nonStaticMethod();

	}

	static void staticMethod() {
		System.out.println("Static Variable : " + model);
	}

	static void nonStaticMethod() {
		System.out.println("Overloaded static method");
	}
}
