package arrayListAssignment;

import java.util.ArrayList;

public class Q1ArrayListWithoutGenerics {
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		// Integer type arrayList without using Generic
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		al1.add(5);
		al1.add(6);
		al1.add(7);
		System.out.println("Content of Integer type ArrayList : " + "\n" + al1);
		// String type ArrayList without using Gneric
		ArrayList al2 = new ArrayList();
		al2.add("Nilesh");
		al2.add("Suraj");
		al2.add("Ashwin");
		al2.add("Pavan");
		al2.add("Akshay");
		al2.add("Vishal");
		System.out.println("Content of String type ArrayList : " + "\n" + al2);
	}
}
