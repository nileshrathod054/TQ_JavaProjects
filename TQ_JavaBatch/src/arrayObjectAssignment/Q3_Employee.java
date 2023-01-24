package arrayObjectAssignment;

public class Q3_Employee {
	private int id;
	private String name;
	private double salary;

	public Q3_Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary; 
	}

	public static void main(String[] args) {
		Q3_Employee[] employees = new Q3_Employee[5];
		employees[0] = new Q3_Employee(1, "Nilesh", 1000.00);
		employees[1] = new Q3_Employee(2, "Ashwin", 2000.00);
		employees[2] = new Q3_Employee(3, "Suraj", 1000.00);
		employees[3] = new Q3_Employee(4, "Laxmikant", 3000.00);
		employees[4] = new Q3_Employee(5, "Shridhar", 1000.00);

		double salary = 1000.00;

		System.out.println("Employees with salary " + salary + ":");
		for (Q3_Employee employee : employees) {
			if (employee.getSalary() == salary) {
				System.out.println("Name: " + employee.getName());
			}
		}
	}
}
