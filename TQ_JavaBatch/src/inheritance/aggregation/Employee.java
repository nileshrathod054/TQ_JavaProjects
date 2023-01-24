package inheritance.aggregation;

public class Employee {
	int id;
	String name;
	Department d;//Reference of department class

	public Employee(int id, String name, Department d) {
		super();
		this.id = id;
		this.name = name;
		this.d = d;
	}

	@Override
	public String toString() {
		return id + "" + name + "" + d;

	}

	public static void main(String[] args) {
		Department d = new Department("HR", "Mumbai");
		Employee e = new Employee(1, "Nilesh", d);
		
		System.out.println(e);
	}

}
