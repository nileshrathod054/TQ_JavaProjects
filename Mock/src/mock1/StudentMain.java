package mock1;

import java.util.HashMap;

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Ram", new Course(101, "Java"));
		Student s2 = new Student(2, "Ram", new Course(102, "Angular"));
		Student s3 = new Student(3, "Ram", new Course(101, "Java"));
		Student s4 = new Student(4, "Ram", new Course(102, "Angular"));
		Student s5 = new Student(5, "Ram", new Course(103, "C++"));

		HashMap<String, Integer> ch = new HashMap<>();
		if (ch.containsKey(s1.c.c_name)) {
			Integer c = ch.get(s1.c.c_name);
			ch.put(s1.c.c_name, c + 1);
		} else {
			ch.put(s1.c.c_name, 1);
		}
		if (ch.containsKey(s2.c.c_name)) {
			Integer c = ch.get(s2.c.c_name);
			ch.put(s2.c.c_name, c + 1);
		} else {
			ch.put(s2.c.c_name, 1);
		}
		if (ch.containsKey(s3.c.c_name)) {
			Integer c = ch.get(s3.c.c_name);
			ch.put(s3.c.c_name, c + 1);
		} else {
			ch.put(s3.c.c_name, 1);
		}
		if (ch.containsKey(s4.c.c_name)) {
			Integer c = ch.get(s4.c.c_name);
			ch.put(s4.c.c_name, c + 1);
		} else {
			ch.put(s4.c.c_name, 1);
		}
		if (ch.containsKey(s5.c.c_name)) {
			Integer c = ch.get(s5.c.c_name);
			ch.put(s5.c.c_name, c + 1);
		} else {
			ch.put(s5.c.c_name, 1);
		}
		System.out.println(ch);
	}
}
