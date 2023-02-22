package assignmentOnMapStackAndArrayList18thFeb;

import java.util.*;

class Student {
	private String name;
	private String id;

	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

}

public class Q9_StudentSetCombine {
	public static void main(String[] args) {
		ArrayList<Student> s1 = new ArrayList<>();
		s1.add(new Student("John", "123"));
		s1.add(new Student("Mark", "456"));
		s1.add(new Student("Kate", "789"));

		ArrayList<Student> s2 = new ArrayList<>();
		s2.add(new Student("John", "123"));
		s2.add(new Student("Andy", "987"));
		s2.add(new Student("Kate", "789"));

		Set<Student> s3 = new HashSet<>();
		s3.addAll(s1);
		s3.addAll(s2);

		System.out.println("Student set : " + s3);
	}

}
