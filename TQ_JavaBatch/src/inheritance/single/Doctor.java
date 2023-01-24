package inheritance.single;

public class Doctor extends Object {
	int id;
	String name;
	String location;

	public Doctor(int id, String name, String location) {
		// super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

	void display() {
		System.out.println("Id is..." + id + "\nName is..." + name + "\nLacation is..." + location);
	}

	public static void main(String[] args) {

		Doctor dr = new Doctor(101, "Dr.Nilesh", "Amravati");
		dr.display();

	}

}
