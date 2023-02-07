package arrayListEx;

public class Employee {
	int id;
	String name;
	double salary;
	private static String cname = "TCS";

	public int getId() {
		return id;

	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static String getCname() {
		return cname;
	}

	public String toString() {
		return "Employee[id=" + id + ", Name=" + name + ", Salary=" + salary + "]";
	}
}
