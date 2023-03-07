package com.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.dao.ShopController;
import com.dao.ShopImpl;
import com.pojo.Shop;

public class ShopTest {
	void show() throws ClassNotFoundException, SQLException {
		String ans;
		do {
			System.out.println("Enter options");
			Scanner sc = new Scanner(System.in);

			System.out.println("1.  Add Shop");
			System.out.println("2.  Update Shop");
			System.out.println("3.  Remove Shop");
			System.out.println("4.  View Shop");

			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			ShopController cr = new ShopImpl();
			Shop s;

			switch (choice) {
			case 1: {
				System.out.println("Enter Shop Id");
				int id = sc.nextInt();
				System.out.println("Enter Shop Category");
				String category = sc.next();
				System.out.println("Enter Shop Name");
				String s_name = sc.next();
				System.out.println("Enter Customer Name");
				String c_name = sc.next();
				System.out.println("Enter Shop Status");
				String s_status = sc.next();
				System.out.println("Enter Shop Owner Name");
				String s_owner = sc.next();
				System.out.println("Enter Lease Status");
				String l_status = sc.next();

				s = new Shop(id, category, s_name, c_name, s_status, s_owner, l_status);

				boolean b = cr.insert(s);
				if (b == true) {
					System.out.println("Record inserted sucessfully");
				} else
					System.out.println("Record does not inserted");
				break;
			}
			case 2: {
				System.out.println("Enter Shop Id");
				int id = sc.nextInt();
				System.out.println("Enter Shop Category");
				String category = sc.next();
				System.out.println("Enter Shop Name");
				String s_name = sc.next();
				System.out.println("Enter Customer Name");
				String c_name = sc.next();
				System.out.println("Enter Shop Status");
				String s_status = sc.next();
				System.out.println("Enter Shop Owner Name");
				String s_owner = sc.next();
				System.out.println("Enter Lease Status");
				String l_status = sc.next();

				s = new Shop(id, category, s_name, c_name, s_status, s_owner, l_status);
				boolean b = cr.update(s);
				if (b == true) {
					System.out.println("Record Updated sucessfully");
				} else
					System.out.println("Record does not updated");
				break;
			}
			case 3: {
				boolean b = cr.delete();
				if (b == true) {
					System.out.println("Record deleted sucessfully");
				} else
					System.out.println("Record does not deleted");
				break;
			}
			case 4:
				cr.view();
				break;

			}
			System.out.println("Do you want to  continue Yes/No");
			ans = sc.next();
		} while (ans.equalsIgnoreCase("yes"));

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ShopTest t = new ShopTest();
		t.show();

	}
}
