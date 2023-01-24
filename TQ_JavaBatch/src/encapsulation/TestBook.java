package encapsulation;

import java.util.Scanner;

public class TestBook {
	public static void main(String[] args) {
		Book b = new Book();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Book name : ");
		String bookName = sc.next();
		System.out.println("Enter the price :");
		int bookPrice = sc.nextInt();
		System.out.println("Enter the Author name :");
		String authorName = sc.next();
		System.out.println("Book Details :");
		System.out.println("Book Name : " + bookName);
		System.out.println("Book Price : " + bookPrice);
		System.out.println("Auhor Name : " + authorName);

	}
}
