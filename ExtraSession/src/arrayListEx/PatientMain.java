package arrayListEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PatientMain {
	public static void main(String[] args) {
		ArrayList<Patient> al = new ArrayList<Patient>();
		al.add(new Patient(1, "Ajay", "Kidney Stone", "India"));
		al.add(new Patient(2, "Bob", "Heart Attack", "America"));
		al.add(new Patient(3, "Alex", "Fever", "UAE"));
		al.add(new Patient(4, "Vijay", "Lever Failure", "Russia"));
		al.add(new Patient(5, "Micheal", "Cancer", "SWitzerland"));

		System.out.println("---Patient Sorting in Ascending order on basis of name-------");
		Collections.sort(al, new PatientSortingByName());
		Iterator<Patient> it = al.iterator();
		while (it.hasNext()) {
			Patient p = it.next();
			System.out.println(p);
		}

		System.out.println("---Patient Sorting in descending order on basis of location----");
		Collections.sort(al, new PatientSortingByLocation());
		Iterator<Patient> it1 = al.iterator();
		while (it1.hasNext()) {
			Patient p1 = it1.next();
			System.out.println(p1);
		}
	}
}
