package markerInterface.Serializable;

import java.io.Serializable;

public class Employee implements Serializable {

	int empid;
	String empname;

	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}

}
