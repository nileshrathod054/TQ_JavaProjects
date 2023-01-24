package array;

import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) {
		int bookid;
		String bookname;
		String authorname; 
		int prize;

		int choice;
		int count = 0, flag = 0;
		;

		Scanner sc = new Scanner(System.in);
		Book b[] = new Book[10];

		while (true) {
			System.out.println("1.add book:");

			System.out.println("2.update book:");
			System.out.println("3.delete book:");

			System.out.println("4.search book:");
			System.out.println("5.get all:");

			System.out.println("6.exit:");
			System.out.println(".7insert  book:");
			System.out.println(" ");

			System.out.println("enter the choice:");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("add book:");
				System.out.println("enter the no of book to enter:");
				int size = sc.nextInt();

				for (int i = 0; i < size; i++) {
					System.out.println("enter the bookid:");
					bookid = sc.nextInt();

					System.out.println("enter the bookname :");
					bookname = sc.next();

					System.out.println("enter the book authorname for update:");
					authorname = sc.next();

					System.out.println("enter the book prize for update:");
					prize = sc.nextInt();

					b[i] = new Book(bookid, bookname, authorname, prize);
					count++;

				}
				System.out.println("Add book successfull :");
				break;

			case 2:
				System.out.println("2.update book:");
				System.out.println("enter the book id for update:");
				bookid = sc.nextInt();
				for (int i = 0; i < count; i++) {
					if (b[i] != null && b[i].getBookId() == bookid) {
						System.out.println("enter the bookname for update:");
						bookname = sc.next();

						b[i].setBookName(bookname);
						System.out.println("enter the book authorname for update:");
						authorname = sc.next();
						b[i].setAuthorName(authorname);
						System.out.println("enter the book prize for update:");
						prize = sc.nextInt();
						b[i].setPrice(prize);

					}
				}
				System.out.println("book update successfully:");
				break;

			case 3:

				System.out.println("delete book:");
				System.out.println("enter the bookid for delete:");
				bookid = sc.nextInt();
				for (int i = 0; i < count; i++) {
					if (b[i] != null && b[i].getBookId() == bookid) {
						b[i] = null;
					}
				}

				System.out.println("delete book successfully:");
				break;

			case 4:

			{
				int i;
				System.out.println("search book:");
				System.out.println("enter the bookid for search :");
				bookid = sc.nextInt();
				System.out.println("bookid  " + "\t" + "bookname  " + "\t" + "author name  " + "\t" + "prize  ");
				for (i = 0; i < count; i++) {
					if (b[i] != null && b[i].getBookId() == bookid) {
						flag = 1;

					}
				}
				if (flag == 1) {
					System.out.println(b[i]);
				} else
					System.out.println("Book id is not present");
				System.out.println("search completed:");
				break;
			}

			case 5:

				System.out.println("all info book:");

				System.out.println("all book are:");
				System.out.println("bookid  " + "\t" + "bookname  " + "\t" + "author name  " + "\t" + "prize  ");
				for (int i = 0; i < count; i++) {
					// System.out.println(b[i]);
					if (b[i] != null) {

						System.out.println(b[i]);

					}
				}

				System.out.println("all book are this:");
				break;

			case 6:
				System.exit(0);

			default:
				System.out.println("enter right choice:");

			case 7:
				for (int i = count; i < count + 1; i++) {
					System.out.println("enter the bookid:");
					bookid = sc.nextInt();

					System.out.println("enter the bookname :");
					bookname = sc.next();

					System.out.println("enter the book authorname for update:");
					authorname = sc.next();

					System.out.println("enter the book prize for update:");
					prize = sc.nextInt();

					b[i] = new Book(bookid, bookname, authorname, prize);

				}
				count++;

			}

		}

	}

}
