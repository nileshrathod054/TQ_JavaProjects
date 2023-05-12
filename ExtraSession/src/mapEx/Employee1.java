package mapEx;

import java.util.ArrayList;

public class Employee1 {
	int id;
	String name;
	long salary;

	ArrayList<String> skill = new ArrayList<>();

	public Employee1(int id, String name, long salary, ArrayList<String> al) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.skill = al;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + ", al=" + skill + "]";
	}
}
