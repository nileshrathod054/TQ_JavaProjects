package mock1;

public class Student {
	int rollNo;
	String name;
	Course c;

	Student() {

	}

	public Student(int rollNo, String name, Course c) {
		this.rollNo = rollNo;
		this.name = name;
		this.c = c;
	}

	@Override
	public String toString() {
		return String.format("Student [rollNo=%s, name=%s, c=%s]", rollNo, name, c);
	}

}
