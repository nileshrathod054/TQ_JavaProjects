package mapEx;

public class Department{
	int d_id;
	String d_name;

	Department() {

	}

	Department(int d_id, String d_name) {
		this.d_id = d_id;
		this.d_name = d_name;
	}

	@Override
	public String toString() {
		return "Dept_Id=" + d_id + ", Dept_Name=" + d_name;
	}

	}
