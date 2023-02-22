package assignmentOnMapStackAndArrayList18thFeb;

import java.util.TreeSet;

public class Q13LowestElementTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> tr = new TreeSet<>();
		tr.add(20);
		tr.add(40);
		tr.add(10);
		tr.add(50);

		int lowestElement = tr.pollFirst();
		System.out.println("Lowest element from the TreeSet is: " + lowestElement);
		System.out.println("Elements of TreeSet after removing lowest element=" + tr);
	}
}
