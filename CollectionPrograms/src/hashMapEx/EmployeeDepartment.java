package hashMapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeDepartment {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "rakesh", "mumbai");
		Employee e2 = new Employee(2, "sonal", "pune");
		Employee e3 = new Employee(3, "pinky", "hyderabad");

		Department d1 = new Department(1, "HR");
		Department d2 = new Department(2, "I.T");

		HashMap<Employee, Department> hs = new HashMap<>();

		hs.put(e1, d1);
		hs.put(e2, d1);
		hs.put(e3, d2);

		Set<Entry<Employee, Department>> set = hs.entrySet();

		for (Map.Entry<Employee, Department> map : set) {
			Employee e = map.getKey();
			Department d = map.getValue();
			if (d.name.equals("HR")) {
				System.out.println(e.name);
			}
			// System.out.println(e.id+" "+e.name+"
			// "+e.location+"={"+d.d_id+","+d.name+"}");
		}

	}

}
