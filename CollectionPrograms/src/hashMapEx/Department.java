package hashMapEx;

public class Department {

	int d_id;
	String name;

	public Department(int d_id, String name) {
		super();
		this.d_id = d_id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [d_id=" + d_id + ", name=" + name + "]";
	}

}
