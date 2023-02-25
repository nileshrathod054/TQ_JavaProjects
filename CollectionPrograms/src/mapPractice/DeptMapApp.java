package mapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DeptMapApp {
	private static final Entry<Integer, Department>[] entry = null;

	public static void main(String[] args) {
		Student s1 = new Student(11, "Nilesh");
		Student s2 = new Student(12, "Ashwin");
		Student s3 = new Student(13, "Pankaj");
		Student s4 = new Student(14, "Khushal");

		List<Student> studentlist = new ArrayList<>();
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		studentlist.add(s4);

		Department d1 = new Department(1, "Computers", studentlist);
		Department d2 = new Department(2, "Mechanical", studentlist);
		Department d3 = new Department(3, "Civil", studentlist);
		Department d4 = new Department(4, "Electronics", studentlist);

		Map<Integer, Department> deptmap = new HashMap<>();
		deptmap.put(d1.deptid, d1);
		deptmap.put(d2.deptid, d2);
		deptmap.put(d3.deptid, d3);
		deptmap.put(d4.deptid, d4);

		System.out.println(deptmap);

		Set<Entry<Integer, Department>> entry = deptmap.entrySet();
		for (Entry<Integer, Department> e : entry) {
			System.out.println("(Key) Dept Id : " + e.getKey());

			Department o = e.getValue();
			System.out.println("Department Id : " + o.deptid + " Department Name : " + o.deptname);

			List<Student> sl = o.studentlist;
			for (Student s : sl) {
				System.out.println("\t\t" + "Student Id : " + s.rollno + " Student Name : " + s.name);
			}
		}
	}

}
