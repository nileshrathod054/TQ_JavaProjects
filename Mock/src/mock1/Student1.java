package mock1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student1 implements Comparable<Student1> {

	int id;
	String name;
	Float marks;

	public Student1(int id, String name, Float marks) {
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
	public int compareTo(Student1 o) {
		if (this.marks > o.marks) {
			return 1;
		} else if (this.marks < o.marks) {
			return -1;
		} else
			return 0;
	}

	public static void main(String[] args) {
		ArrayList<Student1> al = new ArrayList<>();
		Student1 s1 = new Student1(1, "Nilesh", 89.0f);
		Student1 s2 = new Student1(2, "Suraj", 90.0f);
		Student1 s3 = new Student1(3, "Gaurav", 88.0f);
		Student1 s4 = new Student1(4, "Manish", 85.0f);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);

		Collections.sort(al);

		Iterator<Student1> it = al.iterator();
		while (it.hasNext()) {
			Student1 s = it.next();
			System.out.println(s);

		}
	}
}
