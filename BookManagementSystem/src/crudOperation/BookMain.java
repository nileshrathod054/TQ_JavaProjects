package crudOperation;

import java.util.Scanner;

public class BookMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		Operations o = new BookImp();
		do {
			System.out.println("1.Insert");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.Search");
			System.out.println("5.Show_Details");
			System.out.println("6.Exit");
			System.out.println("Enter the choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				boolean bol = o.insert();
				if (bol == true) {
					System.out.println("Record Inserted Succesfully");
				}

				break;
			case 2:
				boolean bol1 = o.update();
				if (bol1 == true) {
					System.out.println("Record Updating Succesfully");
				}
				break;
			case 3:
				boolean bol2 = o.delete();
				if (bol2 == true) {
					System.out.println("Record Deleting Succesfully");
				}
				break;
			case 4:
				boolean bol3 = o.search();
				if (bol3 == true) {
					System.out.println("Book is available");
				}
				break;

			case 5:
				o.show_details();

				System.out.println("Books are available");

				break;
			default:
				System.out.println("Exit ");
				System.out.println("Thank you for visiting us..!!");
				return;
			}

		} while (choice != 6);

	}

}