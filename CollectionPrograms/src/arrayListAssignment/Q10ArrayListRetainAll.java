package arrayListAssignment;

import java.util.*;

public class Q10ArrayListRetainAll {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Violet");
		al.add("Indigo");
		al.add("Blue");
		al.add("Green");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Yellow");
		al2.add("Orange");
		al2.add("Red");
		al2.add("Blue");
		al2.add("Violet");
		al.retainAll(al2);
		System.out.println("Iterating the elements after retaining al2 : ");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
