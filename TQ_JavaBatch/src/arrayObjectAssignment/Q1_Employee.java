package arrayObjectAssignment;

class Department {
	private int deptId;
	private String deptname;

	public Department(int deptId, String deptname) {
		this.deptId = deptId;
		this.deptname = deptname;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
}

public class Q1_Employee {

	private int empno;
	private String empname;
	private Department dept;

	public Q1_Employee(int empno, String empname, Department dept) {
		this.empno = empno;
		this.empname = empname;
		this.dept = dept;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public static void main(String[] args) {

		Q1_Employee[] employees = new Q1_Employee[3];
		employees[0] = new Q1_Employee(1, "Nilesh", new Department(1, "IT"));
		employees[1] = new Q1_Employee(2, "Laxmikant", new Department(2, "Mech"));
		employees[2] = new Q1_Employee(3, "Suraj", new Department(3, "CSE"));

		for (int i = 0; i < employees.length; i++) {
			System.out.println("Employee Number: " + employees[i].getEmpno());
			System.out.println("Employee Name: " + employees[i].getEmpname());
			System.out.println("Department Id: " + employees[i].getDept().getDeptId());
			System.out.println("Department Name: " + employees[i].getDept().getDeptname());
			
		}

	}

}
