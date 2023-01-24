package assignment_29thDec;

import java.util.Scanner;

public class TicketMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ticket t = new Ticket();
		System.out.println("Enter No Of Bookings : ");
		int no_booking = sc.nextInt();
		System.out.println("Enter Available Tickets : ");
		int available_tickets = sc.nextInt();
		for (int i = 1; i <= no_booking; i++) {
			System.out.println("Available Tickets : " + t.getAvailabTickets());
			System.out.println("Enter Ticket Id : ");
			int ticket_id = sc.nextInt();
			System.out.println("Enter Price : ");
			int t_price = sc.nextInt();
			System.out.println("Enter No Of Tickets : ");
			int no_of_tickets = sc.nextInt();
			t.setTicketid(ticket_id);
			t.setPrice(t_price, no_of_tickets);
			t.setAvailableTickets(available_tickets);
			int x = t.calculateTicketCost(no_of_tickets);
			t.setAvailableTickets(x);
		}
	}
}
