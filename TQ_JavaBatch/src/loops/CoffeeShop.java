package loops;

import java.util.Scanner;

public class CoffeeShop {

	public static void main(String[] a) {
		String name = " ";
		int product = 0;
		int rate = 0, amt = 0;
		int quant = 0, tq = 0;
		System.out.println("Welcome to Our Coffee Shop.");
		System.out.println("1.COLD COFFEE @ Rs.50");
		System.out.println("2.HOT COFFE @ Rs.20 ");
		System.out.println("3.GREEN TEA @ Rs.20");
		System.out.println("4.MILK TEA @ Rs.10");
		System.out.println("5.LEMON TEA @ Rs.20");
		System.out.println("6.BLACK TEA @ Rs.20");
		System.out.println("");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Customer name :");
		name = sc.next();

		do {
			System.out.print("Enter the product code :");
			product = sc.nextInt();

			switch (product) {
			case 1: {

				rate = 50;
				if (rate == 50) {
					System.out.print("Enter quantity : ");
					quant = sc.nextInt();
				}
				System.out.println("Your order is for COLD COFFE with " + quant + " quantity ");
				amt = rate * quant;
				System.out.println("The amount will be Rs." + amt);
				System.out.println("-------------------------------");

				break;

			}
			case 2: {

				rate = 20;
				if (rate == 20) {
					System.out.print("Enter quantity : ");
					quant = sc.nextInt();
				}
				System.out.println("Your order is for HOT COFFE whit " + quant + " quantity");
				amt = rate * quant;
				// System.out.println("The amount will be rs."+rate);

				System.out.println("-------------------------------");
				break;
			}

			case 3: {

				rate = 20;
				if (rate == 20) {
					System.out.print("Enter quantity : ");
					quant = sc.nextInt();
				}
				System.out.println("Your order is for GREEN TEA with " + quant + " quantity");
				amt = rate * quant;
				System.out.println("The amount will be Rs." + amt);
				System.out.println("-------------------------------");
				break;
			}
			case 4: {

				rate = 10;
				if (rate == 20) {
					System.out.print("Enter quantity : ");
					quant = sc.nextInt();
				}
				System.out.println("Your order is for MILK TEA with " + quant + " quantity");
				amt = rate * quant;
				System.out.println("The amount will be Rs." + amt);
				System.out.println("-------------------------------");
				break;
			}

			case 5: {

				rate = 20;
				if (rate == 20) {
					System.out.print("Enter quantity : ");
					quant = sc.nextInt();
				}
				System.out.println("Your order is for LEMON TEA with " + quant + " quantity");
				amt = rate * quant;
				System.out.println("The amount will be rs." + amt);

				System.out.println("-------------------------------");
				break;
			}
			case 6: {

				rate = 20;
				if (rate == 20) {
					System.out.print("Enter quantity : ");
					quant = sc.nextInt();
				}
				System.out.println("Your order is for BLACK TEA with " + quant + " quantity");
				amt = rate * quant;
				System.out.println("The amount will be Rs." + amt);
				System.out.println("-------------------------------");
				break;
			}
			case 0: {

				System.exit(0);
				System.out.println("Thank You!");
			}
			}
		} while (rate == amt);

		tq = quant + tq;
		amt = rate * tq;
		System.out.println("Your total amount will be rs." + amt);

	}

}
