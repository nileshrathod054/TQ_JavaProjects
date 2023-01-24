package class_object;

class Student {
	int id;
	String name;

	Student() {
	}

	Student(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println("Id is ..." + id);
		System.out.println("Name is...." + name);
	}

	public static void main(String[] args) {
		Student s1 = new Student(1, "Nilesh");
		s1.display();
		Student s2 = new Student();
		s2.id = s1.id;
		s2.name = s1.name;
		s2.display();
	}
}
