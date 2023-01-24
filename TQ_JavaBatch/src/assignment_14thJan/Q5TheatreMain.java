package assignment_14thJan;

import java.util.Scanner;

class Movie {
	int movie_id;
	String movie_name;
	int rating;

	public Movie(int movie_id, String movie_name, int rating) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [movie_id=" + movie_id + ", movie_name=" + movie_name + ", rating=" + rating + "]";
	}

}

class Theatre {
	int theatre_id;
	String theatre_name;
	String location;
	Movie m;

	public Theatre(int theatre_id, String theater_name, String location, Movie m) {
		super();
		this.theatre_id = theatre_id;
		this.theatre_name = theater_name;
		this.location = location;
		this.m = m;
	}

	@Override
	public String toString() {
		return "Theatre [theatre_id=" + theatre_id + ", theatre_name=" + theatre_name + ", location=" + location + ", m="
				+ m + "]";
	}
}

public class Q5TheatreMain {
	public static void main(String[] args) {
		Theatre th[] = new Theatre[2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < th.length; i++) {
			System.out.println("Enter theater Id");
			int theatre_id = sc.nextInt();
			System.out.println("Enter theatre name");
			String theatre_name = sc.next();
			System.out.println("Enter location");
			String location = sc.next();
			System.out.println("Enter movie id");
			int movie_id = sc.nextInt();
			System.out.println("Enter the movie name");
			String movie_name = sc.next();
			System.out.println("Rating of movie");
			int rating = sc.nextInt();
			Movie m = new Movie(movie_id, movie_name, rating);
			th[i] = new Theatre(theatre_id, theatre_name, location, m);

		}
		int temp;
		for (int i = 0; i < th.length - 1; i++) {
			for (int j = 0; j < th.length - 1; j++) {

				if (th[j].m.rating > th[j + 1].m.rating) {
					temp = th[j].m.rating;
					th[j].m.rating = th[j + 1].m.rating;
					th[j + 1].m.rating = temp;

					int temp1 = th[j].theatre_id;
					th[j].theatre_id = th[j + 1].theatre_id;
					th[j + 1].theatre_id = temp1;

					String temp2 = th[j].theatre_name;
					th[j].theatre_name = th[j + 1].theatre_name;
					th[j + 1].theatre_name = temp2;

					String temp3 = th[j].location;
					th[j].location = th[j + 1].location;
					th[j + 1].location = temp3;

					int temp4 = th[j].m.movie_id;
					th[j].m.movie_id = th[j + 1].m.movie_id;
					th[j + 1].m.movie_id = temp4;

					String temp5 = th[j].m.movie_name;
					th[j].m.movie_name = th[j + 1].m.movie_name;
					th[j + 1].m.movie_name = temp5;
				}
			}
		}
		for (int i = 0; i < th.length; i++) {
			System.out.println("sorted on the bases of rating " + th[i]);
		}

	}
}
