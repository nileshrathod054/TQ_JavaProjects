package arrayObjectAssignment;

public class Q4_Student {

	int roll;
	String name;
	int age;
	int marks;

	Q4_Student(int roll, String name, int age, int marks) {
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public static void main(String[] args) {
		Q4_Student[] s = new Q4_Student[4];

		s[0] = new Q4_Student(1, "Nilesh", 12, 75);
		s[1] = new Q4_Student(2, "Suraj", 8, 55);
		s[2] = new Q4_Student(3, "Avinash", 10, 65);
		s[3] = new Q4_Student(4, "Akshay", 14, 79);

		for (Q4_Student s1 : s) {
			if (s1.marks > 60 && s1.age < 15) {
				System.out.println("Student Roll : " + s1.roll);
				System.out.println("Student Name : " + s1.name);
				System.out.println("Student Age : " + s1.age);
				System.out.println("Student Marks : " + s1.marks);
			}
		}
	}

}
