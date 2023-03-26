package collectionTest;

public class Employee implements Comparable<Employee> {
	private int empid;
	private String name;

	public Employee() {
		super();

	}

	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.setName(name);
	}

	@Override
	public String toString() {
		return String.format("Employee [empid=%s, name=%s]", empid, getName());
	}

	@Override
	public int compareTo(Employee o) {
		if (o.empid < this.empid)
			return 1;
		else if (o.empid > this.empid)
			return -1;
		else
			return 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
