package mapEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class EmployeeSortingByLocation {
	public static void main(String[] args) {
		Department d1 = new Department(1, "HR");
		Department d2 = new Department(2, "IT");
		Department d3 = new Department(3, "Sales");

		Employee e1 = new Employee(1, "Pooja","Mumbai", d1);
		Employee e2 = new Employee(2, "Ram","Pune", d2);
		Employee e3 = new Employee(3, "Suraj","Mumbai", d3);
		Employee e4 = new Employee(4, "Sonal","Chennai", d1);
		Employee e5 = new Employee(5, "Kinjal","Pune", d2);

		ArrayList<Employee> al = new ArrayList<>();

		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);

		HashMap<String, ArrayList<String>> hm1 = new HashMap<>();
		Iterator<Employee> it = al.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			String s1 = e.location;
			if (hm1.containsKey(s1)) {
				ArrayList<String> al2 = hm1.get(s1);
				al2.add(e.name);
				hm1.put(s1, al2);
			} else {
				ArrayList<String> al2 = new ArrayList<>();
				al2.add(e.name);
				hm1.put(s1, al2);

			}
		}
		System.out.println("Employee Sorting By Address"+hm1);
	}
}
