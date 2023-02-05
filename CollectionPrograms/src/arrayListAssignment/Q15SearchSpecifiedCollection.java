package arrayListAssignment;

import java.util.ArrayList;

public class Q15SearchSpecifiedCollection {
	public static void main(String[] args) {
		ArrayList <String>al = new ArrayList<String>();
		al.add("Laptop");
		al.add("Bag");
		al.add("Books");
		al.add("NoteBook");
		ArrayList <String>al2 = new ArrayList<String>();
		al2.add("Pen");
		al2.add("Practice Papers");
		al2.add("Story Books");

		al.addAll(al2);
		boolean check = al.containsAll(al2);
		System.out.println(check);
		boolean containsAll = al2.containsAll(al);
		System.out.println(containsAll);
	}
}
