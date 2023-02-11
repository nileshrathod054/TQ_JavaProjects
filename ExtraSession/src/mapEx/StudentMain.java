package mapEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class StudentMain {
	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(1, "Nilesh", "A+"));
		al.add(new Student(2, "Shubham", "B"));
		al.add(new Student(3, "Ravi", "A+"));
		al.add(new Student(4, "Chetan", "D"));
		al.add(new Student(5, "Vishal", "C"));

		HashMap<Integer, String> hm = new HashMap<>();
		Iterator<Student> it = al.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			if (s.grade == "A+") {
				int id = s.id;
				String s1 = s.name;

				hm.put(id, s1);
			}
		}
		System.out.println(hm);

	}

}