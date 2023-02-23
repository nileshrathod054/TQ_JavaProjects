package mapPractice;

import java.util.List;

public class Department {
	int deptid;
	String deptname;

	List<Student> studentlist;

	public Department(int deptid, String deptname, List<Student> studentlist) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
		this.studentlist = studentlist;
	}

	@Override
	public String toString() {
		return "Department Deptid=" + deptid + ", Dept Name=" + deptname + ", Student List=" + studentlist;
	}
}
