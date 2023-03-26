package collectionTest;

class Student {
	String name;

	Student() {

	}

	Student(String name) {
		this.name = name;
	}
}

public class HashCodeEx {
	public static void main(String[] args) {
//		Student s1 = new Student("NR");
//		Student s2 = new Student("NR");

		Student s1=new Student("Nilesh");
		Student s2=s1;
		System.out.println(s1);
		System.out.println(s2);

	}
}
