package class_object;

public class StudentDetails1 {
	// method,variables,constructor,block

	int s_id;
	String s_name;
	float per;

	void addStudent(int id, String name, float p) {
		s_id = id;
		s_name = name;
		per = p;

	}// end of local parameter

	void print() {
		System.out.println("id is..." + s_id);
		System.out.println("name is..." + s_name);
		System.out.println("per is..." + per);
	}

	{
		System.out.println("welcome to school");
	}

	public static void main(String[] args) {
		// reference
		// 1)object is created
		// 2) default constructor is called automatically
		StudentDetails1 s1 = new StudentDetails1();
		System.out.println("-----Student 1------------");

		s1.addStudent(1, "pooja", 89.0f);
		s1.print();
		System.out.println(s1);

		System.out.println("-----Student 2------------");

		StudentDetails1 s2 = new StudentDetails1();
		s2.addStudent(2, "kinjal", 82.0f);
		s2.print();
		System.out.println(s2);

		System.out.println("-----Student 3------------");

		StudentDetails1 s3 = new StudentDetails1();

		s3.addStudent(3, "komal", 78.0f);
		s3.print();
		System.out.println(s3);

	}

}
