package arrayListAssignment;

import java.util.*;

public class Q6ArrayListUsingForEachLoop {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Orange");
		al.add("Banana");
		al.add("Grapes");
		al.add("Straberry");
		for (String fruit : al)
			System.out.println(fruit);
	}
}
