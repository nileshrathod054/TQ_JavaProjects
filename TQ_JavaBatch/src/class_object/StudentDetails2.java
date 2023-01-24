package class_object;

import java.util.Scanner;

public class StudentDetails2 {
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

	{// Instance block
		System.out.println("welcome to our school");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for (int i = 1; i <= size; i++) {
			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter percentage");
			float per = sc.nextFloat();
			StudentDetails2 s = new StudentDetails2();
			s.addStudent(id, name, per);
			s.print();
		}

	}

}
