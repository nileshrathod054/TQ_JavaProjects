package mock1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student implements Comparable<Student> {

	int id;
	String name;
	Float marks;

	public Student(int id, String name, Float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return String.format("Student [id=%s, name=%s, marks=%s]", id, name, marks);
	}

	@Override
	public int compareTo(Student o) {
		if (this.marks > o.marks) {
			return 1;
		} else if (this.marks < o.marks) {
			return -1;
		} else
			return 0;
	}

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		Student s1 = new Student(1, "Nilesh", 89.0f);
		Student s2 = new Student(2, "Suraj", 90.0f);
		Student s3 = new Student(3, "Gaurav", 88.0f);
		Student s4 = new Student(4, "Manish", 85.0f);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);

		Collections.sort(al);

		Iterator<Student> it = al.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s);

		}
	}
}
