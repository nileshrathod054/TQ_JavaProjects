package mapEx;

public class Student {
	int id;
	String name;
	String grade;

	public Student(int id, String name, String grade) {
		
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return String.format("Student [id=%s, name=%s, grade=%s]", id, name, grade);
	}

}
