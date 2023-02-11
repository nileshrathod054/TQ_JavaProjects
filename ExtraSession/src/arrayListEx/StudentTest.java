package arrayListEx;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 22));
		al.add(new Student(102, "Anthony", 24));
		al.add(new Student(105, "Jay", 21));
		al.add(new Student(103, "Amar", 25));
		al.add(new Student(104, "Akbar", 26));

		// Sorting On basis of age
		Collections.sort(al);

		for (Student st : al) {
			System.out.println(st);
		}
	}
}
