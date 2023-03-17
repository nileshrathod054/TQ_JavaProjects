package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.connection.DBConnection;
import com.dao.Controller;
import com.dao.PersonImpl;
import com.dao.PersonRecord;
import com.pojo.Person;

public class PersonMain {
	Connection con;

	public void view() throws ClassNotFoundException, SQLException {
		System.out.println("\n----------Slot List---------");
		con = DBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs4 = st.executeQuery("select * from slot");
		while (rs4.next()) {
			System.out.println(rs4.getInt(1) + " " + rs4.getTime(2) + " " + rs4.getTime(3));
		}
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Slot Id...");
		int sl_id = sc1.nextInt();
		String sq = "select status from slot where sl_id=?";
		PreparedStatement ps = con.prepareStatement(sq);
		ps.setInt(1, sl_id);
		ResultSet rs5 = ps.executeQuery();

		if (rs5.next()) {
			String status = rs5.getString("status");
			if (status.equalsIgnoreCase("booked")) {
				System.out.println("\nSorry, this time slot is not available..!!");
			} else {

				String ans;

				do {

					Scanner sc = new Scanner(System.in);

					System.out.println("Enter your Choice");
					System.out.println("Person details");
					System.out.println("");
					int ch = sc.nextInt();
					PersonRecord pr = new PersonImpl();
					Person p;
					switch (ch) {
					case 1: {
						System.out.println("Please Enter Your data....");
						System.out.println("Please Enter Your Id...");
						int p_id = sc.nextInt();
						System.out.println("Please Enter Your Name...");
						String p_name = sc.next();
						System.out.println("Please Enter Your Date Of Birth...");
						String p_dob = sc.next();
						System.out.println("Please Enter Your Adhar Card Number....");
						String p_adhar = sc.next();
						System.out.println("Please Enter Your Phone Number...");
						String p_phno = sc.next();
						System.out.println("Please Enter Your Address...");
						String p_address = sc.nextLine();

						p = new Person(p_id, p_name, p_dob, p_adhar, p_phno, p_address);
						boolean bool = pr.insert(p);

						if (bool == true)
							System.out.println("\nVaccine Slot got booked successfully..!!");

					}
					case 2: {
						pr.display();
						break;
					}
					}

					System.out.println("\nDo you want to  book the vaccination slot yes/no");
					ans = sc.next();
				} while (ans.equalsIgnoreCase("yes"));

			}
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		{
			System.out.println("**********Welcome To Our Vaccinator And Verifier App**********");
		}

		Controller cr = new Controller();
		cr.show1();
		cr.show2();
		PersonMain pm = new PersonMain();
		pm.view();
	}
}
