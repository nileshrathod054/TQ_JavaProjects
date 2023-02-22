package assignmentOnMapStackAndArrayList18thFeb;

import java.util.HashMap;

public class Q6Main {
	public static void main(String[] args) {
		Q6Student s1 = new Q6Student(1, "Ram", new Course(101, "Java"));
		Q6Student s2 = new Q6Student(2, "Shyam", new Course(102, "Python"));
		Q6Student s3 = new Q6Student(3, "Nilesh", new Course(101, "Java"));
		Q6Student s4 = new Q6Student(4, "Suraj", new Course(103, "Angular"));
		Q6Student s5 = new Q6Student(5, "Shridhar", new Course(103, "Angular"));
		Q6Student s6 = new Q6Student(6, "Ashwin", new Course(104, "C++"));

		HashMap<String, Integer> ch = new HashMap<>();

		if (ch.containsKey(s1.c.cname)) {
			Integer c = ch.get(s1.c.cname);
			ch.put(s1.c.cname, c + 1);
		} else {

			ch.put(s1.c.cname, 1);
		}

		if (ch.containsKey(s2.c.cname)) {
			Integer c = ch.get(s2.c.cname);
			ch.put(s2.c.cname, c + 1);
		} else {
			ch.put(s2.c.cname, 1);
		}

		if (ch.containsKey(s3.c.cname)) {
			Integer c = ch.get(s3.c.cname);
			ch.put(s3.c.cname, c + 1);
		} else {
			ch.put(s3.c.cname, 1);
		}

		if (ch.containsKey(s4.c.cname)) {
			Integer c = ch.get(s4.c.cname);
			ch.put(s4.c.cname, c + 1);
		} else {
			ch.put(s4.c.cname, 1);
		}

		if (ch.containsKey(s5.c.cname)) {
			Integer c = ch.get(s5.c.cname);
			ch.put(s5.c.cname, c + 1);
		} else {
			ch.put(s5.c.cname, 1);
		}
		if (ch.containsKey(s6.c.cname)) {
			Integer c = ch.get(s6.c.cname);
			ch.put(s6.c.cname, c + 1);
		} else {
			ch.put(s6.c.cname, 1);
		}

		System.out.println(ch);

	}
}
