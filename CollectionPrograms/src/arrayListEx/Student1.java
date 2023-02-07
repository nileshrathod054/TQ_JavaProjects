package arrayListEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Student1 implements Comparable<Student1>, Comparator<Student1> {
	int id;
	String name;
	Float marks;

	public Student1() {

	}

	public Student1(int id, String name, float marks) {

		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student1 o) {
		if (this.marks < o.marks)
			return 1;
		else if (this.marks > o.marks)
			return -1;
		else
			return 0;
	}

	@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.name.compareTo(o2.name);
	}

	public static void main(String args[]) {
		ArrayList<Student1> al = new ArrayList<>();
		Student1 s1 = new Student1(1, "payal", 67.8f);
		al.add(s1);
		al.add(new Student1(2, "rosy", 89.9f));
		al.add(new Student1(3, "kinjal", 90.0f));
		al.add(new Student1(4, "alex", 82.3f));
		al.add(new Student1(5, "bob", 92.0f));
		al.add(new Student1(6, "bob", 78.0f));
		System.out.println("-- on basis of marks");
		Collections.sort(al);

		Iterator<Student1> it = al.iterator();

		while (it.hasNext()) {
			Student1 s = it.next();
			System.out.println(s);
		}

		System.out.println("-- sorting on basis of name");
		Collections.sort(al, new Student1());

		Iterator<Student1> it1 = al.iterator();

		while (it1.hasNext()) {
			Student1 s = it1.next();
			System.out.println(s);
		}

	}

}
