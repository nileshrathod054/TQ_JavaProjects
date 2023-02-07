package arrayListExtraAssignment;

public class Employee {
	int id;
	String name;
	int sal;

	public Employee(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return sal;
	}

	@Override
	public String toString() {
		return "Employee[Id=" + id + ", Name=" + name + ", Salary=" + sal + "]";
	}
}
