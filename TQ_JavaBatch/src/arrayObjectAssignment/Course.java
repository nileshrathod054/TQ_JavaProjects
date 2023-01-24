package arrayObjectAssignment;

public class Course {

	String s_name;
	int fee;

	public Course(String s_name, int fee) {
		super();
		this.s_name = s_name;
		this.fee = fee;

	}

	@Override
	public String toString() {
		return "Course[s_name=" + s_name + ",fee=" + fee + "]";
	}
}
