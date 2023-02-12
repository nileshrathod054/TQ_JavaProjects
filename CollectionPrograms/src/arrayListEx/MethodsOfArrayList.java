package arrayListEx;

import java.util.ArrayList;
import java.util.List;

public class MethodsOfArrayList {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Aakanksha");
		names.add("Rachit");
		names.add("Aakanksha");
		names.add("Gauri");
		names.add("Kavita");
		System.out.println("List names are : ");
		System.out.println(names);
		ArrayList<String> namelist = new ArrayList<>();
		namelist.add("Vijay");
		namelist.add("Rachit");
		// addAll()

		namelist.addAll(names);
		System.out.println("After adding names" + ", modified namelist : " + namelist);

		// Added object at specific index
		namelist.add(3, "Meenal");
		System.out.println("After adding object at specific position");
		System.out.println(namelist);

		// Sublist(startIndex, endIndex)
		List<String> l = namelist.subList(3, 6);
		System.out.println("subList from namelist...");
		System.out.println(l);

		// remove() method removes the first occurrence of object.
		if (namelist.contains("Meenal")) {
			boolean result = namelist.remove("Meenal");
		}
		System.out.println("After removing object namelist is : ");
		System.out.println(namelist);

		// To remove all occurrences of object.
		// let's remove all occurrences of "Aakanksha"
//		String str = null;
//		for (String s : namelist) {
//			if (s.equals("Aakanksha")) {
//				// remove object
//				str = namelist.remove(namelist.indexOf(s));
//			}
//			System.out.println("After removing all occurrences of " + str);
//			System.out.println(namelist);
			/*
			 * It will throws ConcurrentModificationException because of the limitation of
			 * for each loop, we can iterate list in forward direction only but we can not
			 * do any modification in list like addition or deletion
			 */
		//}
		// retainAll
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Vijay");
		l1.add("Gauri");
		namelist.retainAll(l1);
		System.out.println("After retaining only l1, elements in namelist");
		System.out.println(namelist);
	}
}
