package assignmentOnMapStackAndArrayList18thFeb;

import java.util.*;

public class Q16_SortBaller {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();

		al.add("Om");
		al.add("Ram");
		al.add("Kiran");
		al.add("Shree");
		al.add("Sagar");
		al.add("Ganesh");

		HashSet<String> hs1 = new HashSet<>();
		HashSet<String> hs2 = new HashSet<>();

		Iterator<String> it = al.iterator();

		while (it.hasNext()) {
			String s = it.next();

			int i = al.indexOf(s);

			if (i % 2 == 0) {
				hs1.add(s);
			} else {
				hs2.add(s);
			}
		}

		System.out.println("Baller list");
		System.out.println(hs1);

		System.out.println("Batsman list");
		System.out.println(hs2);
	}

}
