package assignement_27thDec;

public class Student {
	int id = 101;
	String name = "Nilesh";

	int getId() {
		return 25;
	}

	void display() {
		id = 102;
		name = "Ashwin";
		System.out.println("-------Display Method--------");
		System.out.println("Student Id is : " + id);
		System.out.println("Name of the student is : " + name);
	}

	void displayData() {
		System.out.println("-------Display data method--------");
		System.out.println("Student Id is : " + getId());
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.displayData();
		s1.display();
		Student s2 = new Student();
		s2.id = s1.id;    //Object value copying
		s2.name = s1.name;
		s2.display();

	}
}
