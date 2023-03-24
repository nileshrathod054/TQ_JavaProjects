package mock;

import java.util.ArrayList;
import java.util.Iterator;

public class Employeee1Main {
	public static void main(String[] args) {
		ArrayList<Employee1> al = new ArrayList<>();
		Employee1 e1 = new Employee1(1, "Nilesh", 25000);
		Employee1 e2 = new Employee1(2, "Suraj", 15000);
		Employee1 e3 = new Employee1(3, "Shridhar", 13000);
		Employee1 e4 = new Employee1(4, "Ashwin", 29000);

		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);

		Iterator<Employee1> it = al.iterator();
		while (it.hasNext()) {
			Employee1 e = it.next();
			if (e.salary < 20000) {
				System.out.println(e.name);

				System.out.println(e.salary + e.salary * 0.20);
			}

		}

	}
}
