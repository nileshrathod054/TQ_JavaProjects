package abstraction;

interface InsertDetails {
	public static final String code = "AAA";

	default void show() {
		System.out.println("Showing properties");
	}

	static void staticShow() {
		secure();
	}

	static void secure() {
		System.out.println(code);
	}

	void insert();
}

class Student implements InsertDetails {
	int id;
	String name;
	char grade;

	public Student(int id, String name, char grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	@Override
	public void insert() {
		System.out.println(id + " " + name + " " + grade);
	}

}

public class JavaFeatures {
	public static void main(String[] args) {

		Student s = new Student(1, "Pooja", 'A');
		s.insert();
		s.show();
		InsertDetails.staticShow();
	}
}