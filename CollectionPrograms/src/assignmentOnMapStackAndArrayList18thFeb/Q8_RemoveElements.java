package assignmentOnMapStackAndArrayList18thFeb;

import java.util.*;

public class Q8_RemoveElements {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();

		hs.add("Monday");
		hs.add("Tuesday");
		hs.add("Wednesday");
		hs.add("Thusday");
		hs.add("Friday");
		hs.add("Saturday");
		hs.add("Sunday");

		Iterator<String> it = hs.iterator();

		while (it.hasNext()) {
			String s = it.next();

			if ((s.equals("Saturday")) || (s.equals("Sunday"))) {
				it.remove();
			}
		}

		System.out.println(hs);
	}

}
