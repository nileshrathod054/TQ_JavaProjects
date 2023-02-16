package mapEx;

public class StudentCou {
	int roll_no;
	String name;
	Course C;

	public StudentCou(int roll_no, String name, Course c) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		C = c;
	}

	@Override
	public String toString() {
		return "StudentCou [roll_no=" + roll_no + ", name=" + name + ", C=" + C + "]";
	}

}
