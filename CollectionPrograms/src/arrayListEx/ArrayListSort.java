package arrayListEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSort {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();

		ArrayList<String> al2 = new ArrayList<>();

		al.add("blue");
		al.add("black");
		al.add("brown");
		al.add("green");
		// al.add(null);

		Iterator<String> it = al.iterator();

		while (it.hasNext()) {
			String s = it.next().toLowerCase();
			al2.add(s);

		}

		Collections.sort(al2);

		System.out.println(al2);

	}

}
