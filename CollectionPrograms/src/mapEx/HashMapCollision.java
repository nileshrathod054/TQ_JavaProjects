package mapEx;

import java.util.HashMap;

public class HashMapCollision {

	public static void main(String[] args) {
//		HashMap<Integer,String> hs=new HashMap<Integer,String>();
//		
//		hs.put(1,"red");//1
//		hs.put(2,"black");//2
//		hs.put(1,"brown");//1
//		
//		System.out.println(hs);

		HashMap<Student, Course> hs = new HashMap();
		Student s1 = new Student(1, "pooja");
		Student s2 = new Student(2, "ram");
		Student s3 = new Student(3, "alex");
		Student s4 = new Student(4, "bob");

		Course c1 = new Course("Software", 40000);
		Course c2 = new Course("Machine", 45000);
		Course c3 = new Course("hardware", 35000);

		hs.put(new Student(1, "pooja"), c1);
		hs.put(new Student(2, "ram"), c2);
		hs.put(new Student(1, "pooja"), c3);

		System.out.println(hs);

	}

}
