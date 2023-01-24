package encapsulation;

import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Movie m = new Movie();
		System.out.println("Enter movie name");
		String name = sc.next();
		m.setMovieName(name);
		System.out.println("Enter category");
		m.setMovieCategory(sc.next());
		System.out.println("Enter circle");
		String circle = sc.next();

		int price = m.calculateTicketCost(circle);
		m.setTicketCost(price);

		System.out.println("movie name is.." + m.getMovieName());
		System.out.println("movie category is.." + m.getMovieCategory());
		System.out.println("Ticket cost.." + m.getTicketCost());

	}

}
