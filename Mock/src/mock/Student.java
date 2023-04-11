package mock;

public class Student {
	int rollNo;
	String s_name;
	Department d;

	public Student() {

	}

	public Student(int rollNo, String s_name, Department d) {
		super();
		this.rollNo = rollNo;
		this.s_name = s_name;
		this.d = d;
	}

	@Override
	public String toString() {
		return String.format("Student [rollNo=%s, s_name=%s, d=%s]", rollNo, s_name, d);
	}

	public static void main(String[] args) {
		Department d1 = new Department(1, "Mech");
		Department d2 = new Department(2, "Civil");
		Department d3 = new Department(1, "IT");

		Student s1 = new Student(1, "Nilesh", d1);
		Student s2 = new Student(2, "Suraj", d2);
		Student s3 = new Student(3, "Himalay", d1);
		Student s4 = new Student(4, "Mangesh", d3);
		Student s5 = new Student(5, "Amey", d2);
		Student s6 = new Student(6, "Pravin", d3);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
	}
}
