package encapsulation;

public class Stud {
	int id;
	String name;

	Stud() {

	}

	public Stud(int id, String name) {

		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println("id...." + id);
		System.out.println("name is..." + name);
	}

	public static void main(String[] args) {

		Stud s = new Stud(1, "pooja");
		s.display();
		Stud s1 = new Stud();
		s1.id = s.id; // Object Copying
		s1.name = s.name;
		s1.display();
		s1.name = "rahul";
		s.display();
		s1.display();

	}

}
