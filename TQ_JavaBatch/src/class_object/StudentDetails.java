package class_object;

public class StudentDetails {
	/* Method, variables, constructor, block */
	int s_id;
	String s_name;
	float per;

	void addStudent(int id, String name, float p) {
		s_id = id;
		s_name = name;
		per = p;
	}

	// End of local parameter
	void print() {
		System.out.println("Id is...." + s_id);
		System.out.println("Name is..." + s_name);
		System.out.println("Percentage is...." + per);
	}

	{
		System.out.println("Welcome to our school.");// Instance block
	}

	public static void main(String[] args) {
		/*
		 * Reference object is created. default constructor is called automatically
		 */
		StudentDetails s1 = new StudentDetails();
		System.out.println("--------Student1--------");
		s1.addStudent(1, "Nilesh", 80.80f);
		s1.print();
		System.out.println(s1);//Memory location
		StudentDetails s2 = new StudentDetails();
		System.out.println("--------Student2--------");
		s2.addStudent(2, "Ashwin", 90.12f);
		s2.print();
		System.out.println(s2);//Memory location
		StudentDetails s3 = new StudentDetails();
		System.out.println("--------Student3--------");
		s3.addStudent(3, "Suraj", 78.80f);
		s3.print();
		System.out.println(s3);//Memory location

	}
}
