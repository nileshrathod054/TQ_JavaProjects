package arrayListEx;

public class Department implements Comparable<Department> {

	int d_id;
	String name;
	String location;

	public Department(int d_id, String name, String location) {
		super();
		this.d_id = d_id;
		this.name = name;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [d_id=" + d_id + ", name=" + name + ", location=" + location + "]";
	}

	@Override
	public int compareTo(Department o) {

		if (this.location.charAt(0) > o.location.charAt(0))
			return 1;
		else if (this.location.charAt(0) < o.location.charAt(0))
			return -1;
		else
			return o.name.compareTo(name);

	}

}
