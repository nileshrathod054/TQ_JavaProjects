package mapEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EmloyeeMai1 {
	public static void main(String[] args) {
		// employee id name salary and arraylist of skil java
		// create a employee arraylist and find out each how many emlooyess in each
		// skills

		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Java");
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("C++");
		ArrayList<String> al3 = new ArrayList<>();
		al3.add("Python");

		Employee1 emp1 = new Employee1(1, "Rohit", 12000, al1);
		Employee1 emp2 = new Employee1(2, "Virat", 10000, al2);
		Employee1 emp3 = new Employee1(3, "Dhoni", 22000, al3);
		Employee1 emp4 = new Employee1(4, "Rahul", 9000, al1);
		Employee1 emp5 = new Employee1(5, "Hardik", 15000, al1);

		ArrayList<Employee1> al = new ArrayList<>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		al.add(emp5);

		Map<String, ArrayList<Employee1>> mp = new HashMap<String, ArrayList<Employee1>>();
		Iterator<Employee1> it = al.iterator();
		while (it.hasNext()) {
			Employee1 e = it.next();

			Iterator<String> it1 = e.skill.iterator();
			while (it1.hasNext()) {
				String s = it1.next();
				if (mp.containsKey(s)) {
					ArrayList<Employee1> emp = mp.get(s);
					emp.add(e);
					mp.put(s, emp);
				} else {
					ArrayList<Employee1> elist = new ArrayList<>();
					elist.add(e);
					mp.put(s, elist);
				}

			}
		}
		Iterator<Employee1> ir = al.iterator();
		while (ir.hasNext()) {
			Employee1 e = ir.next();
			System.out.println(e);
		}

		System.out.println(mp);

	}

}
