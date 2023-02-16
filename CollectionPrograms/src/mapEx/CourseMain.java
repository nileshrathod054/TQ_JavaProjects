package mapEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CourseMain {

	public static void main(String[] args) {
		Course c1 = new Course("Sofware", 35000);
		Course c2 = new Course("Hardware", 30000);
		Course c3 = new Course("Machine", 45000);
		Course c4 = new Course("Compiler Designer", 50000);

		StudentCou s1 = new StudentCou(1, "pooja", c1);
		StudentCou s2 = new StudentCou(2, "ram", c3);
		StudentCou s3 = new StudentCou(3, "kinjal", c4);
		StudentCou s4 = new StudentCou(4, "ramesh", c1);
		StudentCou s5 = new StudentCou(5, "alex", c1);
		StudentCou s6 = new StudentCou(6, "bob", c2);
		StudentCou s7 = new StudentCou(7, "sonali", c3);
		StudentCou s8 = new StudentCou(8, "gauri", c1);
		StudentCou s9 = new StudentCou(9, "payal", c4);

		ArrayList<StudentCou> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);

		al.add(s7);
		al.add(s8);
		al.add(s9);

		HashMap<String, ArrayList<String>> hs = new HashMap<>();

//		HashMap<String,ArrayList<String>> hs1=new HashMap<>();
//		
//		
//		HashMap<Integer,HashMap<String,ArrayList<String>>> hs2=new HashMap<>();
//		
		Iterator<StudentCou> it = al.iterator();

		while (it.hasNext()) {
			StudentCou st = it.next();
			String c_name = st.C.c_name;

			if (hs.containsKey(c_name)) {
				ArrayList<String> s_name = hs.get(c_name);
				s_name.add(st.name);

				hs.put(c_name, s_name);
			} else {
				ArrayList<String> s_name = new ArrayList<>();
				String name = st.name;
				s_name.add(name);

				hs.put(c_name, s_name);
			}
		}

		Set<Entry<String, ArrayList<String>>> set = hs.entrySet();

		for (Map.Entry<String, ArrayList<String>> map : set) {

			System.out.println(map.getKey());
			System.out.println(map.getValue());

		}

	}

}
