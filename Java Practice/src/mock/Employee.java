package mock;

public class Employee {
	int e_id;
	String e_name;
	Department d;

	Employee() {

	}

	public Employee(int e_id, String e_name, Department d) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.d = d;
	}

	@Override
	public String toString() {
		return String.format("Employee [e_id=%s, e_name=%s, d=%s]", e_id, e_name, d);
	}

	

}
