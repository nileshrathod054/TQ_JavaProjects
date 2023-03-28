package mock;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHash {
	public static void main(String[] args) {
		HashSet<Employee1> hs = new HashSet<>();
		Employee1 e1 = new Employee1(1, "Nilesh", 25000);
		Employee1 e2 = new Employee1(2, "Suraj", 15000);
		Employee1 e3 = new Employee1(3, "Shridhar", 13000);
		Employee1 e4 = new Employee1(4, "Ashwin", 29000);
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);

		Iterator<Employee1> itr = hs.iterator();
		while (itr.hasNext()) {
			Employee1 e = itr.next();
			if (e.salary < 20000) {
				System.out.println(e.name);
//			float b = e.salary + e.salary * 0.10F;
//			e.setSalary(b);
				// System.out.println(e.getSalary());
				System.out.println(e.salary + e.salary * 0.10F);
			}
		}
	}
}
