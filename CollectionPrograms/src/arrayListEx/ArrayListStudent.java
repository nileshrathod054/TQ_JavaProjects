package arrayListEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListStudent {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		Student s1 = new Student(1, "payal", 67.8f);
		al.add(s1);
		al.add(new Student(2, "rosy", 89.9f));
		al.add(new Student(3, "kinjal", 90.0f));
		al.add(new Student(4, "alex", 82.3f));
		al.add(new Student(5, "bob", 92.0f));
		al.add(new Student(6, "bob", 78.0f));

		Iterator<Student> it = al.iterator();

		while (it.hasNext()) {
			Student s = it.next();
//		if(s.marks>80)
//		{
//		System.out.println(s);
//		}

			if (s.name.equals("bob")) {
				System.out.println(s);
			}
		}

		// Collections.sort(al);
		System.out.println(al);

	}

}
