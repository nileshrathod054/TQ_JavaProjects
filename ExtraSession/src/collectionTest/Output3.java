package collectionTest;

import java.util.HashSet;

class Flower {
	private String name;

	Flower(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}

public class Output3 {
	public static void main(String[] args) {
		HashSet mySet = new HashSet();
		String s1 = new String("Rose");
		String s2 = new String("Rose");
		Flower s3 = new Flower("Jasmine");
		Flower s4 = new Flower("Jasmine");
		mySet.add(s1);
		mySet.add(s2);
		mySet.add(s3);
		mySet.add(s4);
		System.out.println(mySet);
	}
}
