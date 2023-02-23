package assignmentOnMapStackAndArrayList18thFeb;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

class Employee implements Comparable<Employee> {
	int eid;
	String name;
	int salary;
	Dept d;

	public Employee(int eid, String name, int salary, Dept d) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.d = d;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", d=" + d + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if (this.d.name.equals(o.d.name)) {
			if (this.salary > o.salary) {
				return 1;
			} else if (this.salary < o.salary) {
				return -1;
			} else {
				return 0;
			}
		} else {
			return o.d.name.compareTo(this.d.name);
		}

	}

}

class Dept {
	int did;
	String name;

	public Dept(int did, String name) {
		this.did = did;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dept [did=" + did + ", name=" + name + "]";
	}
}

class SortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.d.name.equals(o2.d.name)) {
			if (o1.salary > o2.salary) {
				return 1;
			} else if (o1.salary < o2.salary) {
				return -1;
			} else {
				return 0;
			}
		} else {
			return 0;
		}

	}

}

public class Q15EmployeeSorting {
	public static void main(String[] args) {
		HashMap<Employee, String> hm = new HashMap<>();
		
		Dept d1 = new Dept(1, "Development");
		Dept d2 = new Dept(2, "Testing");
		Dept d3 = new Dept(3, "AL");
		
		hm.put(new Employee(1, "Ram", 25000, d1), "Pune");
		hm.put(new Employee(2, "Sham", 28000, d2), "Nashik");
		hm.put(new Employee(3, "Pankaj", 30000, d1), "Pune");
		hm.put(new Employee(4, "Rajesh", 29000, d3), "Mumbai");
		
		TreeMap<Employee, String> tm = new TreeMap<>(hm);
		
		System.out.println(tm);
		

	}
}