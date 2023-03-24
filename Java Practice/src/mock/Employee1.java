package mock;
//Create one arraylist of employee type, employee contain id, name, salary 

//update salary by  10% of those employee
//whose salary is 20000

public class Employee1 {
	int id;
	String name;
	int salary;

	Employee1() {

	}

	public Employee1(int id, String name, int salary) {
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("Employee1 [id=%s, name=%s, salary=%s]", id, name, salary);
	}

}
