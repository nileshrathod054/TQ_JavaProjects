package comparableAndComparator;

import java.util.Collections;
import java.util.LinkedList;

public class SortingNameListWithComparable {
	public static void main(String[] args) {
		LinkedList<String> namelist = new LinkedList<>();
		System.out.println(namelist);
		namelist.add("Harsha");
		namelist.add("Nitu");
		namelist.add("Mack");
		namelist.add("Kavita");
		namelist.add("Harish");

		System.out.println(namelist);
		Collections.sort(namelist);
		System.out.println("List sorted in ascending order");
		System.out.println(namelist);

		// To sort ArrayList in reverse order way1 :
		Collections.sort(namelist, Collections.reverseOrder());
		System.out.println("List sorted in descending order");
		System.out.println(namelist);

		// To sort LinkedList in reverse order way2 :
		Collections.sort(namelist);
		System.out.println("List sorted in descending order");
		Collections.reverseOrder();
		System.out.println(namelist);
	}
}
