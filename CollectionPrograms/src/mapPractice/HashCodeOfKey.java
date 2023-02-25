package mapPractice;

import java.util.HashMap;

public class HashCodeOfKey {
	public static void main(String[] args) {
		HashMap<Student, String> m = new HashMap<>();
		Student s1 = new Student(10, "Jay");
		Student s2 = new Student(30, "Ram");
		Student s3 = new Student(22, "Rex");
		Student s4 = new Student(17, "Sam");
		Student s5 = new Student(52, "ved");

		System.out.println("HashCode of s1 : " + s1.hashCode());
		System.out.println("HashCode of s2 : " + s2.hashCode());
		System.out.println("HashCode of s3 : " + s3.hashCode());
		System.out.println("HashCode of s4 : " + s4.hashCode());
		System.out.println("HashCode of s5 : " + s5.hashCode());

		m.put(s1, "Batch1");
		m.put(s2, "Batch2");
		m.put(s3, "Batch1");
		m.put(s4, "Batch2");
		m.put(s5, "Batch2");

	}
}
