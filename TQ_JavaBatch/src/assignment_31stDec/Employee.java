package assignment_31stDec;

public class Employee {
	int id = 101;
	String name = "Nilesh Rathod";
	static String company_name = "CG";

	void display() {
		// Instance method can access static as well as non-static variables
		System.out.println("Non static method or instance method");
		System.out.println("Employee Id : " + id + "\nEmployee name : " + name + "\nCompany Name : " + company_name);
		System.out.println("*****************");
	}

	static void show() {
		// static methods can access only static variables.
		System.out.println("Static method");
//		System.out.println("Employee Id : "+id);
//		System.out.println("Employee Name :"+name);
		System.out.println("Company Name : " + company_name);

	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.display();
		Employee.show();// static methods can be called by class name
	}
}
