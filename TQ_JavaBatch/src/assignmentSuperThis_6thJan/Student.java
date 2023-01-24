package assignmentSuperThis_6thJan;

public class Student {

	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/*
	 * If "this" keyword is removed from the setter method when assigning the
	 * parameter's value, the parameters will get assigned to a local variable
	 * instead of the member variable. This will not have any effect on the member
	 * variable and its value will also remain same.
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setId(11);
		s1.setName("Nilesh Rathod");
		s2.setId(21);
		s2.setName("Suraj Rathod");
		System.out.println("Student Id = " + s1.getId() + "\n" + "Student Name = " + s1.getName());
		System.out.println("Student Id = " + s2.getId() + "\n" + "Student Name = " + s2.getName());

		/*
		 * We can't use this keyword in main method, because this keyword always refers
		 * to the current class method, constructor or object.
		 */
	}
}
