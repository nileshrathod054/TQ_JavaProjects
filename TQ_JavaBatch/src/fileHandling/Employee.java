package fileHandling;

import java.io.Serializable;

public class Employee implements Serializable {
	int id;
	String name;
	int salary;
	transient int s_code;

	public Employee(int id, String name, int salary, int s_code) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.s_code = s_code;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", s_code=" + s_code + "]";
	}

}
