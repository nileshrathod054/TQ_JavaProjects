package mock;
//Create one ArrayList of employee type, employee contain id, name, salary 
//update salary by  10% of those employee
//whose salary is 20000

public class Employee1 {
	int id;
	String name;
	float salary;

	Employee1() {

	}

	public Employee1(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("Employee1 [id=%s, name=%s, salary=%s]", id, name, salary);
	}

}
