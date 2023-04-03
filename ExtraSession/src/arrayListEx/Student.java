package arrayListEx;

public class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;

	}

	@Override
	public int compareTo(Student st) {
		if (this.age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "Student [RollNo=" + rollno + ", Name=" + name + ", Age=" + age + "]";
	}
}
