package class_object;

public class User {
//POJO Class
	String name;
	String location;
	int t_id;
	int price;

	User(String n, String l, int t, int p) {
		name = n;
		location = l;
		t_id = t;
		price = p;

	}

	void print() {
		System.out.println("Name is...." + name);
		System.out.println("location is...." + location);

		System.out.println("Ticket id ...." + t_id);

		System.out.println("Price is....." + price);

	}

	int getPrice() {
		return price;
	}
}
