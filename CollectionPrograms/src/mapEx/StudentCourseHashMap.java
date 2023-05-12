package mapEx;

import java.util.HashMap;
import java.util.TreeMap;

public class StudentCourseHashMap {

	public static void main(String[] args) {
		HashMap<Student, Course> hs = new HashMap<>();
		Student s1 = new Student(1, "pooja");
		Student s2 = new Student(2, "ram");
		Student s3 = new Student(3, "alex");
		Student s4 = new Student(4, "bob");

		Course c1 = new Course("Software", 40000);
		Course c2 = new Course("Machine", 45000);

		hs.put(s1, c1);
		hs.put(s2, c2);
		hs.put(s3, c1);
		hs.put(s4, c2);
		// ascending order of name

		System.out.println("-----sorting ascending order name");
		TreeMap<Student, Course> ts = new TreeMap<Student, Course>(hs);
		System.out.println(ts);

		System.out.println("------sorting desceding order name");
		TreeMap<Student, Course> ts1 = new TreeMap<Student, Course>(new SortingName());
		ts1.putAll(hs);
		System.out.println(ts1);

	}

}
