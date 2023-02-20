package mapEx;

public class Employee {
	int e_id;
	String name;
	String location;
	Department d;

	Employee() {

	}

	Employee(int e_id, String name, String location, Department d) {
		this.e_id = e_id;
		this.name = name;
		this.location = location;
		this.d = d;
	}

	public String toString() {
		return "Employee Id=" + e_id + ", Employee Name=" + name + ", Employee location=" + location + ", Dept Name="
				+ d;
	}
}
