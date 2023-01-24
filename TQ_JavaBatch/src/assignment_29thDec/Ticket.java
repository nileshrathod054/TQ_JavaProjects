package assignment_29thDec;

public class Ticket {
	private int ticketid;
	private int price;
	private static int availableTickets = 25;

	public void setTicketid(int ticket_id) {
		ticketid = ticket_id;
	}

	public int getTicketid() {
		return ticketid;
	}

	public void setPrice(int t_price, int no_of_tickets) {
		price = t_price * no_of_tickets;
	}

	public int getPrice() {
		return price;
	}

	public void setAvailableTickets(int available_tickets) {
		availableTickets = available_tickets;
	}

	public int getAvailabTickets() {
		return availableTickets;
	}

	public int calculateTicketCost(int no_of_tickets) {
		return availableTickets = no_of_tickets;
	}
}
