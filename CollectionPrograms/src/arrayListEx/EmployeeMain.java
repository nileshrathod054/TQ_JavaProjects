package arrayListEx;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeMain {

	void maxSalary(ArrayList<Employee> al) {
		Employee e = al.get(0);
		double max = e.getSalary();

		for (int j = 1; j < al.size(); j++) {
			Employee emp = al.get(j);
			if (emp.getSalary() > max) {
				max = emp.getSalary();
			}
		}
		System.out.println("maximum salary is " + max);

	}

	void print(ArrayList<Employee> al) {

		Iterator<Employee> it = al.iterator();
		System.out.println("company name is.." + Employee.getCname());
		while (it.hasNext()) {
			Employee e = it.next();
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		EmployeeMain em = new EmployeeMain();
		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("pooja");
		e1.setSalary(20000);
		Employee e2 = new Employee();
		e2.setId(102);
		e2.setName("payal");
		e2.setSalary(10000);
		Employee e3 = new Employee();
		e3.setId(103);
		e3.setName("sonal");
		e3.setSalary(25000);

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);

		em.maxSalary(al);
		em.print(al);

	}

}
