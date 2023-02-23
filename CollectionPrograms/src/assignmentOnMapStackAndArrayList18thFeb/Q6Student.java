package assignmentOnMapStackAndArrayList18thFeb;

class Course {
	int cid;
	String cname;

	Course() {

	}

	public Course(int cid, String cname) {
		this.cid = cid;
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Course Id=" + cid + ", Course Name=" + cname;
	}
}

public class Q6Student {
	int rollno;
	String name;
	Course c;

	Q6Student() {

	}

	public Q6Student(int rollno, String name, Course c) {

		this.rollno = rollno;
		this.name = name;
		this.c = c;
	}

	@Override

	public String toString() {
		return "Roll no=" + rollno + ", Name=" + name + ", Cource=" + c;
	}
}
