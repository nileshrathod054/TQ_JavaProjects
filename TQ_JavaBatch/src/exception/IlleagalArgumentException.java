package exception;

import java.util.Scanner;

public class IlleagalArgumentException {
	public static void main(String[] args) throws  InterruptedException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter Id");
		int id = sc.nextInt();
		System.out.println("Name is..." + name);
		System.out.println("Id is..." + id);
		Thread.sleep(30000, 9999999);
	}
}
