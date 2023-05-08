package arrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Course:I'd,name,fee
Arraylist of course
Student :I'd,name,list of course I'd
One student can take multiple courses
Find the student name who applied max courses and print course name*/

class Course {
	String c_id;
	String c_name;
	float fee;

	public Course() {

	}

	public Course(String c_id, String c_name, float fee) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.fee = fee;
	}
	

	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return String.format("Course [c_id=%s, c_name=%s, fee=%s]", c_id, c_name, fee);
	}

}

/*
 * Student :I'd,name,list of course I'd One student can take multiple courses
 * Find the student name who applied max courses and print course name
 */
public class Student {
	int s_id;
	String s_name;
	Course c;

	public Student(int s_id, String s_name, Course c) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.c = c;
	}

	@Override
	public String toString() {
		return String.format("Student [s_id=%s, s_name=%s, c=%s]", s_id, s_name, c);
	}

	public static void main(String[] args) {
		Course c1 = new Course("1", "Java", 12000f);
		Course c2 = new Course("2", "C++", 10000f);
		Course c3 = new Course("3", ".Net", 15000f);

		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(1, "Nilesh", c1));
		al.add(new Student(2, "Suraj", c1));
		al.add(new Student(3, "Himalay", c1));
		al.add(new Student(2, "Suraj", c1));
		al.add(new Student(1, "Nilesh", c2));
		al.add(new Student(3, "Himalay", c1));
		al.add(new Student(1, "Nilesh", c3));
		
		Map<String, Course>hm=new HashMap<>();
		hm.put(c1.getC_id(), c1);
		hm.put(c2.getC_id(), c2);
		hm.put(c3.getC_id(), c3);
		
		int count=0;
		String studentName="";
		List<String>courseName=new ArrayList<>();
		
		
	}
}
