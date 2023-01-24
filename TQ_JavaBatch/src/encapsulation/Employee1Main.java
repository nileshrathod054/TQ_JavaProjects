package encapsulation;

import java.util.Scanner;

public class Employee1Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id : ");
		int employeeId = sc.nextInt();
		System.out.println("Enter Name : ");
		String employeeName = sc.next();
		System.out.println("Enter Salary : ");
		double salary = sc.nextDouble();
		System.out.println("Enter PF Percentage : ");
		double pfpercentage = sc.nextDouble();
		Employee1 emp = new Employee1();
		emp.setEmployeeId(employeeId);
		emp.setEmployeeName(employeeName);
		emp.setSalary(salary);
		emp.calculateNetSalary(pfpercentage);

		System.out.println("Id : " + emp.getEmployeeId());
		System.out.println("Name : " + emp.getEmployeeName());
		System.out.println("Salary : " + emp.getSalary());
		System.out.println("Net Salary : " + emp.getNetSalary());
	}
}
