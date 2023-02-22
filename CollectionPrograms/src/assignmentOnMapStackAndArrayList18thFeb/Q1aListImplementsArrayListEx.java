package assignmentOnMapStackAndArrayList18thFeb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q1aListImplementsArrayListEx {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		// ArrayList interface implements the List interface.
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");

		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
