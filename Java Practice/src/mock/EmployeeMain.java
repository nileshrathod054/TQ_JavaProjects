package mock;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeMain {
	public static void main(String[] args) {
		Department d1 = new Department(1, "IT");
		Department d2 = new Department(2, "HR");

		Employee e1 = new Employee(1, "Pooja", d1);
		Employee e2 = new Employee(2, "Alex", d2);
		Employee e3 = new Employee(3, "Nilesh", d1);
		Employee e4 = new Employee(4, "Suraj", d2);
		Employee e5 = new Employee(5, "Pankaj", d2);

		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);

		Iterator<Employee> it = al.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			if (e.d.d_name.equals("HR")) {
				System.out.println(e.e_name);
			}
		}
	}

}
