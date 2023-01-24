package arrayObjectAssignment;

public class Student1 {

	private int roll_no;
	private String name;
	private int marks;

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "STudent1 [roll_no=" + roll_no + ", name=" + name + ", marks=" + marks + "]";
	}

}
