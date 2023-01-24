package arrayObjectAssignment;

import java.util.Scanner;

public class StudentCourseMain {

	public static void main(String[] args) {
		/*
		 * Course c1=new Course("software",35000); Course c2=new
		 * Course("hardware",55000); Course c3=new Course("Machine learning",45000);
		 */

		/*
		 * Student s1=new Student(1,"Pooja",c1); Student s2=new Student(2,"raj",c2);
		 * Student s3=new Student(3,"Priya",c3); Student s4=new Student(4,"kinjal",c2);
		 * Student s5=new Student(5,"Suresh",c1);
		 */

		Student s[] = new Student[4];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < s.length; i++) {
			System.out.println("Enter student id");
			int s_id = sc.nextInt();
			System.out.println("Enter student name");
			String s_name = sc.next();
			System.out.println("Enter course name");
			String c_name = sc.next();
			System.out.println("Enter course fees");
			int fee = sc.nextInt();
			Course c = new Course(c_name, fee);

			s[i] = new Student(s_id, s_name, c);
		}

		for (int i = 0; i < s.length; i++) {

			if (s[i].c.fee > 50000) {
				s[i].isSpecial = true;
				System.out.println(s[i]);
				System.out.println("student is special");

			}

		}

	}

}
