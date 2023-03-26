package collectionTest;

import java.util.HashSet;

public class Employee1 {
	public String name;

	@Override
	public int hashCode() {
		return 31;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

	@Override
	public String toString() {
		return String.format("Employee [name=%s]", name);
	}

	public static void main(String[] args) {
		Employee1 employeeTwo = new Employee1();
		Employee1 employeeOne = new Employee1();

		employeeTwo.name = "Martin";
		employeeOne.name = "John";
		HashSet employeeSet = new HashSet();

		employeeSet.add(employeeTwo);
		employeeSet.add(employeeOne);
		System.out.println(employeeSet.size());
		System.out.println(employeeSet);
	}
}
