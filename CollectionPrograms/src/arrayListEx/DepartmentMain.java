package arrayListEx;

import java.util.ArrayList;
import java.util.Collections;

public class DepartmentMain {
	void sortingLocation(ArrayList<Department> al) {
		Collections.sort(al);
		System.out.println(al);
	}

	public static void main(String[] args) {
		Department d1 = new Department(1, "HR", "Mumbai");
		Department d2 = new Department(1, "Marketing", "Pune");
		Department d3 = new Department(1, "Finance", "Banglore");
		Department d4 = new Department(1, "I.T.", "Hyderabad");
		ArrayList<Department> al = new ArrayList<>();
		al.add(d1);
		al.add(d2);
		al.add(d3);
		al.add(d4);
		DepartmentMain dm = new DepartmentMain();
		dm.sortingLocation(al);

	}
}
