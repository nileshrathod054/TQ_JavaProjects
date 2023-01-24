package encapsulation;

public class Movie {

	private String movieName;
	private String movieCategory;
	private int ticketCost;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieCategory() {
		return movieCategory;

	}

	public void setMovieCategory(String movieCategory) {
		this.movieCategory = movieCategory;
	}

	public int getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}

	int calculateTicketCost(String circle) {
		if (circle.equals("Gold") && movieCategory.equals("2D"))
			return 300;
		else if (circle.equals("Gold") && movieCategory.equals("3D"))
			return 500;
		else if (circle.equals("Silver") && movieCategory.equals("2D"))
			return 250;
		else if (circle.equals("Silver") && movieCategory.equals("3D"))
			return 450;
		else
			return 0;
	}

}
