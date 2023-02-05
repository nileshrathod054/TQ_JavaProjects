package arrayListAssignment;

import java.util.*;

public class Q16RetrieveElementFromArrayList {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Mech");
		al.add("Civil");
		al.add("CS");
		al.add("IT");
		al.add("ENTC");
		System.out.println(al);
		System.out.println("First element of arraylist : " + al.get(0));
		System.out.println("Third element of arraylist : " + al.get(2));

	}
}
