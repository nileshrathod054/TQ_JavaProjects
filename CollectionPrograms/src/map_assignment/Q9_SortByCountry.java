package map_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Profile {
	String state;
	String country;

	public Profile(String state, String country) {
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Profile [state=" + state + ", country=" + country + "]";
	}

}

class Employee1 implements Comparable<Employee1> {
	int id;
	String name;
	int salary;
	Profile p;

	public Employee1(int id, String name, int salary, Profile p) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.p = p;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + ", p=" + p + "]";
	}

	@Override
	public int compareTo(Employee1 o) {
		return this.p.country.compareTo(o.p.country);

	}

}

public class Q9_SortByCountry {

	public static void main(String[] args) {
		ArrayList<Employee1> al = new ArrayList<>();

		al.add(new Employee1(1, "Ram", 25000, new Profile("Maharashtra", "India")));
		al.add(new Employee1(5, "Kiran", 32000, new Profile("Norway", "USA")));
		al.add(new Employee1(3, "Om", 28000, new Profile("Manchester", "UK")));
		al.add(new Employee1(4, "Kiran", 23000, new Profile("Altai", "Russia")));

		Collections.sort(al);

		Iterator<Employee1> it = al.iterator();

		while (it.hasNext()) {
			Employee1 e = it.next();
			System.out.println(e);
		}
	}

}
