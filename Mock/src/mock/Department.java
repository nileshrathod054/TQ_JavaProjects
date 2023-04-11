package mock;

public class Department {

	int d_id;
	String d_name;

	Department() {

	}

	public Department(int d_id, String d_name) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
	}

	@Override
	public String toString() {
		return "Department= " + "Dept Id= " + d_id + "Dept Name= " + d_name;
	}

}
