package arrayListEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student implements Comparable<Student> {
	int id;
	String name;
	Float marks;

	public Student(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (this.marks < o.marks)
			return 1;
		else if (this.marks > o.marks)
			return -1;
		else
			return 0;
	}

//	@Override
//	public int compareTo(Student o) {
//		return this.marks.compareTo(o.marks);//ascending
//	return o.marks.comapareTo(this.marks);//descending
//	}

	public static void main(String args[]) {
		ArrayList<Student> al = new ArrayList<>();
		Student s1 = new Student(1, "payal", 67.8f);
		al.add(s1);
		al.add(new Student(2, "rosy", 89.9f));
		al.add(new Student(3, "kinjal", 90.0f));
		al.add(new Student(4, "alex", 82.3f));
		al.add(new Student(5, "bob", 92.0f));
		al.add(new Student(6, "bob", 78.0f));

		Collections.sort(al);

		Iterator<Student> it = al.iterator();

		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}

		System.out.println("-- sorting on basis of name");

		Collections.sort(al, new SortingName());

		Iterator<Student> it1 = al.iterator();

		while (it1.hasNext()) {
			Student s = it1.next();
			System.out.println(s);
		}
		System.out.println("--- sorting by id");
		Collections.sort(al, new SortingId());

		Iterator<Student> it2 = al.iterator();

		while (it2.hasNext()) {
			Student s = it2.next();
			System.out.println(s);
		}

	}

}
