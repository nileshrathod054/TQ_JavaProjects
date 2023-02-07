package arrayListExtraAssignment;

import java.util.ArrayList;

public class EmployeeMain {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(1, "John", 10000));
		al.add(new Employee(2, "Bob", 20000));
		al.add(new Employee(3, "Sachin", 15000));
		al.add(new Employee(4, "Raj", 25000));
		al.add(new Employee(5, "Rohan", 30000));
		System.out.println("Employee whose salary is greater than 10000");
		for (Employee e : al) {
			if (e.getSalary() > 10000) {
				System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
			}
		}
		System.out.println("Employee who have name Sachin");
		for (Employee e : al) {
			if (e.getName().equals("Sachin")) {
				System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
			}
		}
		int highestSal = 0;
		for (Employee e : al) {
			if (e.getSalary() > highestSal) {
				highestSal = e.getSalary();
			}
		}
		System.out.println("Employee who have highest number of salary");
		for (Employee e : al) {
			if (e.getSalary() == highestSal) {
				System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
			}
		}
	}
}
