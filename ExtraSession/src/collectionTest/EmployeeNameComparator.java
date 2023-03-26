package collectionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.getName().compareTo(o2.getName());
	}

	public static void main(String[] args) {
		ArrayList<Employee> alEmp = new ArrayList<>();
		Employee e1 = new Employee(3, "Ajit");

		Employee e2 = new Employee(4, "Suman");
		Employee e3 = new Employee(5, "Nilesh");
		alEmp.add(e1);
		alEmp.add(e2);
		alEmp.add(e3);

		Collections.sort(alEmp, new EmployeeNameComparator());

		Iterator<Employee> it = alEmp.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			System.out.println(e);
		}
	}
}
