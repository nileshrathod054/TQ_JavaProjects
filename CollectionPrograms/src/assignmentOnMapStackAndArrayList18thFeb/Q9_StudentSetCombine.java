package assignmentOnMapStackAndArrayList18thFeb;

import java.util.*;

public class Q9_StudentSetCombine {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();

		al1.add("Om");
		al1.add("Ram");
		al1.add("Kiran");
		al1.add("Shree");

		ArrayList<String> al2 = new ArrayList<>();

		al2.add("Sagar");
		al2.add("Om");
		al2.add("Ram");
		al2.addAll(al1);

		HashSet<String> hs = new HashSet<>();

		Iterator<String> it = al2.iterator();

		while (it.hasNext()) {
			String s = it.next();

			hs.add(s);

		}

		System.out.println(hs);
	}

}
