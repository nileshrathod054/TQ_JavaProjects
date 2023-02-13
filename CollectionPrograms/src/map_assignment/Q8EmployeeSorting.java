package map_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + id + ", Name=" + name + ", Salary=" + salary + "]";
	}
}

class Name implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.name.compareTo(o2.name);
	}

}

public class Q8EmployeeSorting {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "Nilesh", 25000));
		al.add(new Employee(102, "Shivam", 25000));
		al.add(new Employee(103, "Ashwin", 25000));
		al.add(new Employee(104, "Pankaj", 25000));

		Collections.sort(al, new Name());
		System.out.println(al);
	}
}
