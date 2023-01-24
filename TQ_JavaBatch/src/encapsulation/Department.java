package encapsulation;

public class Department {

	int d_id;
	String d_name;

	Department(int d_id, String d_name) {
		this.d_id = d_id;
		this.d_name = d_name;
	}

	void display() {
		this.greeting();
		System.out.println("Department id......." + d_id);
		System.out.println("Department name ....." + d_name);
	}

	void greeting() {
		System.out.println("Welcome to our department.");
	}

	public static void main(String[] args) {
		Department d1 = new Department(1, "HR");
		d1.display();
		Department d2 = new Department(2, "Accounts");
		d2.display();
	}
}
