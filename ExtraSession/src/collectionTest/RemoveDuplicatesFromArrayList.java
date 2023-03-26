package collectionTest;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesFromArrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");

		al.add("Sun");
		al.add("Mon");
		al.add("Sat");

		HashSet hs = new HashSet(al);

		hs.addAll(al);
		ArrayList<String> al2 = new ArrayList<>(hs);
		System.out.println(al2);

	}
}
