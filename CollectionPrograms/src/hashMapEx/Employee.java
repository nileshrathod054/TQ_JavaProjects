package hashMapEx;

public class Employee {

	int id;
	String name;
	String location;

	public Employee(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", location=" + location + "]";
	}

}
