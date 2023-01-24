package assignment_24thDec;

import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args) {

		int pizza = 100;
		int puffs = 20;
		int cooldrink = 10;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bill Details");
		System.out.println("Enter the number of pizza bought.");
		int q_pizzas = sc.nextInt();
		System.out.println("Enter the number of puffs bought.");
		int q_puffs = sc.nextInt();
		System.out.println("Enter the number of cooldrink bought.");
		int q_cooldrink = sc.nextInt();

		int totalCost = (pizza * q_pizzas) + (puffs * q_puffs) + (cooldrink * q_cooldrink);
		
		System.out.println("Total Price of Bill : Rs." + totalCost);
		System.out.println("------------------------------");
		System.out.println("ENJOY THE SHOW!!!");
	}
}
