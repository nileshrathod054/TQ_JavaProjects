package crudOperation;

import java.util.ArrayList;
import java.util.Scanner;

public class BookImp implements Operations {
	Scanner sc = new Scanner(System.in);
	boolean flag1 = false;
	int count = 0;
	int id = 0;
	int flag = 0;
	ArrayList<Book> al = new ArrayList<>();
	Book b = null;

	@Override
	public boolean insert() {
		System.out.println("1.Add Book");
		System.out.println("Enter the Book id...");
		int id = sc.nextInt();
		System.out.println("Enter the Book Name...");
		String name = sc.next();
		System.out.println("Enter the Book Price...");
		float price = sc.nextFloat();
		b = new Book(id, name, price);
		count++;
		al.add(b);
		flag1 = true;

		return flag1;
	}

	@Override
	public boolean update() {
		System.out.println("2.Update Book:");
		System.out.println("Enter the book id for Update:");
		int bookid = sc.nextInt();
		if (b != null && b.getId() == id) {
			System.out.println("Enter the bookname for Update:");
			String name = sc.next();

			b.setName(name);
			System.out.println("Enter the book Prize for Update:");
			int prize = sc.nextInt();
			b.setPrice(prize);
		}

		al.add(b);
		flag1 = true;

		return flag1;
	}

	@Override
	public boolean delete() {
		System.out.println("Delete the Book:");
		System.out.println("Enter the bookid for Delete:");
		id = sc.nextInt();
		if (b != null && b.getId() == id) {
			b = null;
		}
		al.add(b);
		flag1 = true;
		return flag1;
	}

	@Override
	public boolean search() {
		System.out.println("Searching the Book:");
		System.out.println("Enter the bookid for search :");
		id = sc.nextInt();
		System.out.println("bookid  " + "\t" + "bookname  " + "\t" + "prize  ");
		if (b != null && b.getId() == id) {
			flag = 1;
		}
		if (flag == 1) {
			System.out.println(b);
		}
		al.add(b);
		flag1 = true;
		return flag1;
	}

	@Override
	public void show_details() {
		System.out.println("All Information Book:");

		System.out.println("All Book are Available:");
		System.out.println("bookid  " + "\t" + "bookname " + "\t" + "prize  ");
		if (b != null) {

			System.out.println(b);
		}

	}

	@Override
	public void exit() {
		System.exit(0);

	}

}