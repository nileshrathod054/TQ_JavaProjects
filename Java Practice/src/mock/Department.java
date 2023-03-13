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
		return String.format("Department [d_id=%s, d_name=%s]", d_id, d_name);
	}

	
}
