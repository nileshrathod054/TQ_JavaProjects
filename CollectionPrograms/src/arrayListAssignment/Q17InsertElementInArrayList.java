package arrayListAssignment;

import java.util.ArrayList;
import java.util.List;

public class Q17InsertElementInArrayList {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Electrical");
		al.add("Civil");
		al.add("CS");
		al.add("IT");
		al.add("ENTC");

		System.out.println(" Original arraylist : " + al);
		al.add(0, "Mech");
		System.out.println("\n After adding element at the first position : " + al);
	}
}
