package mock1;

public class Course {
	int c_id;
	String c_name;

	Course() {

	}

	public Course(int c_id, String c_name) {
		this.c_id = c_id;
		this.c_name = c_name;

	}

	@Override
	public String toString() {
		return "Course Id: " + c_id + " Course Name: " + c_name;
	}
}
