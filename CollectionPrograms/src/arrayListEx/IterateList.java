package arrayListEx;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateList {
	public static void main(String[] args) {
		ArrayList<String> custList = new ArrayList<>();
		System.out.println(custList);
		custList.add("Ram Kumar");
		custList.add("Manoj Singh");
		custList.add("Kishor Pradhan");
		custList.add("Mandar Deshpande");
		custList.add("Kishor Pradhan");
		custList.add("Govind Phadake");

		// Iterating list using Iterator
		Iterator<String> itr = custList.iterator();
		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		// Removing underlying collection object while iterating
		Iterator<String> str = custList.iterator();
		while (str.hasNext()) {
			String name = str.next();
			if (name.equals("Ram Kumar")) {
				str.remove();
				System.out.println("Object removed");
				System.out.println(name);
			}
		}
		System.out.println("After removing the object : " + custList);

	}

}
