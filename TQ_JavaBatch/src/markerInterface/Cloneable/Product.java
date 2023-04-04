package markerInterface.Cloneable;

import java.util.Scanner;

public class Product implements Cloneable {
	int pid;
	String pname;
	double pcost;

	// Product class constructor
	public Product(int pid, String pname, double pcost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
	}

	// method that prints the detail on the console
	public void showDetail() {
		System.out.println("Product ID: " + pid);
		System.out.println("Product Name: " + pname);
		System.out.println("Product Cost: " + pcost);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// Reading the values of the product from the user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Product ID: ");
		int pid = sc.nextInt();

		System.out.print("Enter Product Name: ");
		String pname = sc.next();

		System.out.print("Enter Product Cost: ");
		double pcost = sc.nextDouble();

		System.out.println("------Product Details----");

		Product p1 = new Product(pid, pname, pcost);

		// Cloning the object of the Product class using the clone() method
		Product p2 = (Product) p1.clone();
		// invoking the method to print detail
		p2.showDetail();
	}

}
