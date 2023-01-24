package inheritance.multilevel;

class Person {
	String name;
	String c_name;

	Person() {

	}

	public Person(String name, String c_name) {
		super();
		this.name = name;
		this.c_name = c_name;
	}
}

class Emp extends Person {
	String department;
	int salary;

	Emp() {

	}

	Emp(String name, String c_name, String department, int salary) {
		super(name, c_name);
		this.department = department;
		this.salary = salary;
	}

	public String toString() {
		return "Name is" + name + "Company name..." + c_name + "Department is..." + department + "Salary is..."
				+ salary;
	}
}

class Emp2 extends Person {
	public Emp2(String name, String c_name) {
		super(name, c_name);
	}
}

public class PersonMain {
	public static void main(String[] args) {
		Person p;
		p = new Emp("Nilesh", "HCL", "HR", 150000);
		p = new Emp2("Ram", "I.T.");
		System.out.println(p);
		Person p1 = new Emp("Rahul", "HCL", "Accounts", 18000);
		Emp e3 = (Emp) p1;
		System.out.println(e3);
	}
}
